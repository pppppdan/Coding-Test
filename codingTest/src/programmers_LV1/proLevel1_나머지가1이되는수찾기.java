package programmers_LV1;

public class proLevel1_��������1�̵Ǵ¼�ã�� {

	public static void main(String[] args) {
		int n = 10;
		
		solution(n);
	}
	
	public static int solution(int n) {
        int answer = 0;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}
        
        return answer;
    }

}
