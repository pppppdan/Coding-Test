package programmers;

public class proLevel2_�����ͼ����̵� {

	public static void main(String[] args) {
		int n = 5000;
		
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int ans = 0;

        while (n > 0) {
			ans += n % 2;
			n /= 2;
		}
        
        return ans;
    }

}
