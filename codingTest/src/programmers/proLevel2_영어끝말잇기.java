package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class proLevel2_영어끝말잇기 {

	public static void main(String[] args) {
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		
		System.out.println(Arrays.toString(solution(n, words))); 
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String, Integer> map = new HashMap<>();
        int num = 1;
        int cycle = 1;
        
        map.put(words[0], num++);
        
        for (int i = 1; i < words.length; i++) {
        	if (num > n) {
				num = 1;
				cycle++;
			}
        	
        	if (!map.containsKey(words[i]) && words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) {
        		map.put(words[i], num);
        		num++;	
			} else {
				answer[0] = num;
				answer[1] = cycle;
				break;
			}
		}

        return answer;
    }

}
