package programmers;

public class proLevel1_하샤드수 {
	//하샤드 수 : 양의 정수 x가 x의 자릿수의 합으로 나누어 떨어질 때 x를 '하샤드 수' 라고 함

	public static void main(String[] args) {
		int x = 12;
		
		solution(x);
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        int xCopy = x;
        int sum = 0; //자릿수의 합
        int figures = 0; //자릿수
        
        //자릿수 구하기
        //12는 십의 자릿수 -> figures는 2
        for (int i = 1; i <= x; i *= 10) {
        	if (x >= i) {
        		figures++;
			} else {
				break;
			}
		}
        
        //자릿수 더하기
        //12를 xCopy에 저장해 10으로 나눈 수 -> 1 -> sum에 누적
        //				   10으로 나눈 나머지인 2를 xCopy에 저장
        //	  xCopy를 1로 나눈 수 -> 2 -> sum에 누적
        //			 1로 나눈 나머지 0을 xCopy에 저장 -> for문 나감
        for (int i = figures - 1; i >= 0; i--) {
			sum += xCopy / Math.pow(10, i);
			xCopy = (int) (xCopy % Math.pow(10, i));
			
			if (xCopy == 0) {
				break;
			}
		}
        
        //sum으로 x가 나눠 떨어진다면 하샤드 수 (true)
        //아니라면 false
        if (x % sum != 0) {
			answer = false;
		}
        
        return answer;
    
        
        /* 기태오빠 풀이
         * boolean answer = true;
	
	      int sum = 0;
	      int a = x;
	
	      while (a != 0) {
	         sum += a % 10;
	         a /= 10;
	      }
	      if (x % sum == 0)
	         answer = true;
	      else
	         answer = false;
	
	      return answer;
         */
	}
	
	

}
