package codingTest_LV1;

import java.util.Arrays;
import java.util.Collections;

public class proLevel1_정수내림차순으로배치하기 {

	public static void main(String[] args) {
		long n = 118372;
		
		solution(n);
	}
	
	public static long solution(long n) {
        long answer = 0;
        String nCopy = Long.toString(n);
        String[] arr = new String[nCopy.length()];
        String result = "";
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = Character.toString(nCopy.charAt(i));
		}
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
        
        answer = Long.parseLong(result);
        
        System.out.println(answer);
        
        return answer;
    }

}
