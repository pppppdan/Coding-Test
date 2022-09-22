package programmers;

public class proLevel2_피보나치수 {

	public static void main(String[] args) {
		//int n = 3;
		int n = 5;
		
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int[] fibonacci = new int[n + 1];
		
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		return fibonacci[n] % 1234567;
    }

}
