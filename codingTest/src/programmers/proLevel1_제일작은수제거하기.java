package programmers;

public class proLevel1_제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		
		solution(arr);
	}
	
	public static int[] solution(int[] arr) {
		int[] answer;
		int min = arr[0];
		int idx = 0;
        
        if (arr.length == 1) {
        	answer = new int[1];
			answer[0] = -1;
			return answer;
		} else {
			answer = new int[arr.length - 1];
		}
        
        for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
        
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				answer[idx] = arr[i];
				idx++;
			}
		}
        
        return answer;
    }

}
