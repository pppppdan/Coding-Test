package programmers;

public class proLevel1_콜라츠추측 {

	public static void main(String[] args) {
		long num = 626331;
		
		solution(num);
	}
	
	//홀수의 경우 3배하고 +1 하기 때문에 int 범위 벗어날 수 있음 -> long으로 변경
	public static int solution(long num) {
        int answer = 0;
        
        if (num == 1) {
			return answer;
		}
        
        while (num != 1) {
        	if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
        	
        	answer++;
        	
        	if (answer == 500) {
        		answer = -1;
    			break;
    		}
		}
        
        return answer;
    }

}
