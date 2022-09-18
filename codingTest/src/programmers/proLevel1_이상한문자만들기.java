package programmers;

import java.util.Arrays;

public class proLevel1_이상한문자만들기 {

	public static void main(String[] args) {
		String s = "try hello world";
		
		solution(s);
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] arr = s.split("");
		int idx = 0;
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			idx = arr[i].equals(" ") ? 0 : ++idx;
			
			answer += idx % 2 == 1 ? arr[i].toUpperCase() : arr[i].toLowerCase();
		}
		
		System.out.println(answer);
		
		return answer;
	}

}
