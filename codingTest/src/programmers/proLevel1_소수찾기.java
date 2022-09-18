package programmers;


public class proLevel1_소수찾기 {

	public static void main(String[] args) {
		int n = 10;
		
		solution(n);
	}
	
	public static int solution(int n) {
		/*
		int answer = 0;
        boolean pnCheck = true;
        
        for (int i = 2; i <= n; i++) {
        	for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					pnCheck = false;
					break;
				}
			}
        	
        	if (pnCheck) {
				answer++;
			}
        	
        	pnCheck = true;
        }
        
        return answer;
        */
		
		
		//에라토스테네스의 체 이용
		int answer = 0;
		
		//배열 값과 i값을 동일하게 해주기 위해 list 크기 n+1로 설정
		int[] list = new int[n + 1];
		
		for (int i = 2; i <= n; i++) {
			list[i] = i;
		}
		
		for (int i = 2; i <= n; i++) {
			//이미 0으로 설정된 값이라면(어떤 수의 배수라면) 다음 for문 진행
			if (list[i] == 0) {
				continue;
			}
			
			//i를 제외한 i의 배수 0으로 설정
			for (int j = i * 2; j <= n; j += i) {
				list[j] = 0;
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			//list[i]가 0이 아닌 수 == 소수
			if (list[i] != 0) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
		return answer;
    }

}
