package programmers_LV1;

public class proLevel1_�����������Ǻ� {

	public static void main(String[] args) {
		long n = 121;
		
		solution(n);
	}
	
	public static long solution(long n) {
        long answer = 0;
        
        if (Math.sqrt(n) % 1 == 0) {
			answer = (long) Math.pow(Math.sqrt(n) + 1, 2);
		} else {
			answer = -1;
		}
        
        return answer;
    }

}
