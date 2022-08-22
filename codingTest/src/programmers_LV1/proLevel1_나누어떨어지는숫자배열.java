package programmers_LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class proLevel1_나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		solution(arr, divisor);
	}
	
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
        
        int[] answer;
        int idx = 0;
        
        if (list.size() == 0) {
        	answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			
			for (int i : list) {
				answer[idx] = i;
				idx++;
			}
		}
        
        return answer;
    }

}
