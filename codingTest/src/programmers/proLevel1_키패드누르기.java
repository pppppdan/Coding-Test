package programmers;


public class proLevel1_키패드누르기 {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		//int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		//String hand = "left";
		
		solution(numbers, hand);
	}
	
	
	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int[][] keyPad = {{1,2,3}, {4,5,6}, {7,8,9}, {10,0,12}};
		int left = 10; //*
        int right = 12; //#
        int num_location;
        int left_location = 0, right_location = 0;
        
        for (int i = 0; i < numbers.length; i++) {
        	//continue문 써서 다음 for i 진행하도록
        	if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) { 
        		answer += "L";
        		//System.out.printf("L 위치 : %d / R 위치 : %d / num : %d  - %s\n", left, right, numbers[i], answer);
				left = numbers[i];
				continue;
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) { 
				answer += "R";
				//System.out.printf("L 위치 : %d / R 위치 : %d / num : %d  - %s\n", left, right, numbers[i], answer);
				right = numbers[i];
				continue;
			}
        	
        	//2,5,8,0
        	for (int j = 0; j < keyPad.length; j++) {
        		//2,5,8,0 위치 찾아서 num_location에 저장
				if (numbers[i] == keyPad[j][1]) {
					num_location = j;
					
					//손가락 위치인 k 찾아서
					//거리를 left_location, right_location 저장
					for (int k = 0; k < keyPad.length; k++) {
						if (left == keyPad[k][0]) { //1,4,7 에 위치한 경우
							left_location = Math.abs(num_location - k) + 1;
						} else if (left == keyPad[k][1]) { //2,5,8,0 에 위치한 경우
							left_location = Math.abs(num_location - k);
						}
						
						if (right == keyPad[k][2]) { //3,6,9 에 위치한 경우
							right_location = Math.abs(num_location - k) + 1;
						} else if (right == keyPad[k][1]) { //2,5,8,0 에 위치한 경우
							right_location = Math.abs(num_location - k);
						}
					}
					
					System.out.printf("L 위치 : %d (%d) / R 위치 : %d (%d) / num : %d ", left, left_location, right, right_location, numbers[i]);
					
					//left_location, right_location 찾으면
					//for j 나가도록 break문 사용 
					break;
				}
			}
        	
        	//왼쪽 거리가 더 작으면(왼쪽 엄지손가락이 더 가까우면) 왼쪽 엄지손가락이 클릭
        	if (left_location < right_location) {
        		answer += "L";
				left = numbers[i];
			//오른쪽 거리가 더 작으면(오른쪽 엄지손가락이 더 가까우면) 오른쪽 엄지손가락이 클릭
			} else if (left_location > right_location) {
				answer += "R";
				right = numbers[i];
			//둘 다 거리 같으면 hand에 따라 결정
			} else {
				if (hand.equals("left")) {
					answer += "L";
					left = numbers[i];
				} else {
					answer += "R";
					right = numbers[i];
				}
				//System.out.printf("(%s)", hand);
			}
        	//System.out.printf(" - %s\n", answer);
		}
		
		//System.out.printf("answer = %s\n", answer);
		
		return answer;
		
		
		
		/* 다른 사람 풀이
		 * String answer = "";
	        int left =10;
	        int right =12;
	        
	        for(int tmp: numbers){
	            if(tmp==1||tmp==4||tmp==7){
	                answer+="L";
	                left = tmp;
	            }else if(tmp==3||tmp==6||tmp==9){
	                answer+="R";
	                right = tmp;
	            }else {
	                if(tmp==0) tmp=11;
	                int leftdist = Math.abs(tmp-left) / 3 + Math.abs(tmp-left) % 3;
	                int rightdist = Math.abs(tmp-right) /3 + Math.abs(tmp-right) % 3;
	                
	                if(leftdist<rightdist){
	                    answer+="L";
	                    left = tmp;
	                }else if(leftdist>rightdist){
	                    answer+="R";
	                    right = tmp;
	                }else{
	                    if(hand.equals("left")){
	                        answer+="L";
	                        left = tmp;
	                    }else{
	                        answer+="R";
	                        right = tmp;
	                    }
	                }
	            }
	        }
	        return answer;
		 */
    }

}
