package programmers_LV1;

import java.util.Arrays;
import java.util.Collections;

public class proLevel1_문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		solution(s);
	}
	
	public static String solution(String s) {
        String[] arr = s.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        //System.out.println(Arrays.toString(arr));
        
        StringBuilder sb = new StringBuilder();
        
        for (String str : arr) {
			sb.append(str);
		}
        
        return sb.toString();
    }

}
