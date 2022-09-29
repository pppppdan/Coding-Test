package programmers;

public class proLevel2_n개의최소공배수 {

	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr) {
		int answer = 0;
		
		if (arr.length == 1) {
			return arr[0];
		} else {
			answer = euclidean(arr[0], arr[1]);
			
			for (int i = 2; i < arr.length; i++) {
				answer = euclidean(answer, arr[i]);
			}
		}
		
        return answer;
    }
	
	//유클리드 호제법 - 두 수의 최대공약수를 구하는 알고리즘
	//2개의 자연수 a, b (a > b)에 대해 a를 b로 나눈 나머지를 r이라 하면,
	//a,b의 최대공약수는 r,b의 최대공약수와 같다.
	public static int euclidean(int n1, int n2) {
		int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        
        while (min != 0) {
			int r = max % min;
			max = min; 
			min = r;
		}
        
        return n1 * n2 / max; //max는 최대공약수
	}

}
