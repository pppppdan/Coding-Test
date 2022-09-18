package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class proLevel1_문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		
		solution(strings, n);
	}
	
	public static String[] solution(String[] strings, int n) {
        List<String> n_strings = new ArrayList<>();
        String[] answer = new String[strings.length];
        int idx = 0;
        
        for (int i = 0; i < strings.length; i++) {
			n_strings.add(strings[i].charAt(n) + "_" + strings[i]);
		}
        
        Collections.sort(n_strings);
        
        for (String str : n_strings) {
			answer[idx] = str.substring(2);
			idx++;
		}
        
        return answer;
    }

}
