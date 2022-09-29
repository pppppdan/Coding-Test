package programmers;

public class proLevel2_예상대진표 {

	public static void main(String[] args) {
		int n = 8, a = 4, b = 7;
		
		System.out.println(solution(n, a, b));
	}
	
	public static int solution(int n, int a, int b){
        int cnt = 0;
        
        while (a != b) {
			a = a / 2 + a % 2;
			b = b / 2 + b % 2;
			
			cnt++;
		}
        
        return cnt;
    }

}
