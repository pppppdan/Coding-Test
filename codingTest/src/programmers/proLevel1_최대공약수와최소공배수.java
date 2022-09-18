package programmers;

public class proLevel1_최대공약수와최소공배수 {
	

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		solution(n, m);
	}
	
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        for (int i = 1; i <= Math.max(n, m); i++) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
			}
		}
        
        answer[1] = n * m / answer[0];
        
        return answer;
    }
	
	/*
	//유클리드 호제법 - 두 수의 최대공약수를 구하는 알고리즘
	//2개의 자연수 a, b (a > b)에 대해 a를 b로 나눈 나머지를 r이라 하면,
	//a,b의 최대공약수는 r,b의 최대공약수와 같다.
	 * 
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        while (min != 0) {
			int r = max % min;
			max = min;
			min = r;
		}
        
        answer[0] = max;
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    */
	
	

}
