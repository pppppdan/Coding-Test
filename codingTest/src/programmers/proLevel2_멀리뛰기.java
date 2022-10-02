package programmers;

public class proLevel2_¸Ö¸®¶Ù±â {

	public static void main(String[] args) {
		int n = 4;
		
		System.out.println(solution(n));
	}
	
	public static long solution(int n) {
        long[] fibo = new long[2001];
        
        fibo[1] = 1;
        fibo[2] = 2;
        
        for (int i = 3; i < fibo.length; i++) {
			fibo[i] = (fibo[i - 2] + fibo[i - 1]) % 1234567;
			
			if (i == n) {
				break;
			}
		}
        
        return fibo[n];
    }

}
