package programmers;

public class proLevel2_숫자의표현 {

	public static void main(String[] args) {
		int n = 15;
		
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			
			for (int j = i; j <= n; j++) {
				sum += j;
				
				if (sum == n) {
					cnt++;
					break;
				} else if (sum > n) {
					break;
				}
			}
		}
		
		return cnt;
    }

}
