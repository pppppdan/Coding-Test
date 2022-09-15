package programmers_LV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class proLevel2_ÃÖ´ñ°ª°úÃÖ¼Ú°ª {

	public static void main(String[] args) {
		//String s = "1 2 3 4";
		//String s = "-1 -2 -3 -4";
		String s = "-1 -1";
		
		System.out.println(solution(s));
	}
	
	
	public static String solution(String s) {
		StringTokenizer st = new StringTokenizer(s);
		ArrayList<Integer> list = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		int idx = 1;
		
		for (Integer num : list) {
			if (idx == 1) {
				sb.append(num).append(' ');
			} else if (idx == list.size()) {
				sb.append(num);
			}
			
			idx++;
		}
		
        return sb.toString();
    }

}
