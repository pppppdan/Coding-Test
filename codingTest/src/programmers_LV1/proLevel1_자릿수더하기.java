package programmers_LV1;

public class proLevel1_�ڸ������ϱ� {

	public static void main(String[] args) {
		int n = 123;
		
		solution(n);
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        while (n != 0) {
			answer += n % 10;
			n /= 10;
		}

        return answer;
    }

}
