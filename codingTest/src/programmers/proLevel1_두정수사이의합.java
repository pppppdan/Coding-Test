package programmers;

public class proLevel1_두정수사이의합 {

	public static void main(String[] args) {
		int a, b;
		
		//a = 3;
		//b = 5;
		
		a = 3;
		b = 3;
		
		//a = 5;
		//b = 3;
				
		System.out.println(solution(a, b));
	}
	
	
	
	public static long solution(int a, int b) {
		long answer = 0;
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for (int i = min; i <= max; i++) {
			answer += i;
		}
		
		return answer;
	}

}
