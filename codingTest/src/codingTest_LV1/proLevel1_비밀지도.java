package codingTest_LV1;

import java.util.Arrays;

public class proLevel1_비밀지도 {

	public static void main(String[] args) {
		int n  = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		solution(n, arr1, arr2);

	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] first = new int[n][n];
        int[][] second = new int[n][n];
        
        for (int i = 0; i < n; i++) {
        	//answer[i]의 초기값인 null 제거
			if (answer[i] == null) {
    			answer[i] = "";
    		}
        	
        	for (int j = 0; j < n; j++) {
        		//arr1 배열 -> 5자리 2진수
        		first[i][j] = arr1[i] % 2;
        		arr1[i] = arr1[i] / 2;
        		
        		//arr2 배열 -> 5자리 2진수
        		second[i][j] = arr2[i] % 2;
				arr2[i] = arr2[i] / 2;
        		
        		//둘 중 하나라도 1이면 -> #
            	//둘 다 0이면 -> 공백
				if (first[i][j] == 1 || second[i][j] == 1) {
					answer[i] += "#";
				} else {
					answer[i] += " ";
				}
			}
        	
        	//answer[i] 뒤집기 ***
        	StringBuilder sb = new StringBuilder(answer[i]);
        	answer[i] = sb.reverse().toString();
		}
        
        return answer;
    }

}
