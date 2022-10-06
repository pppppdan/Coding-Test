package programmers;

import java.util.Arrays;

public class proLevel2_H_Index {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		
		System.out.println(solution(citations));
	}
	
	public static int solution(int[] citations) {
		int answer = 0, cnt;
		
		Arrays.sort(citations);
        
		for (int i = citations[citations.length - 1]; i >= 1; i--) {
			cnt = 0;
			
			for (int j = 0; j < citations.length; j++) {
				if (citations[j] / i >= 1) {
					cnt++;
				}
			}
			
			if (cnt >= i && (citations.length - cnt) <= i) {
				answer = i;
				break;
			}
		}
		
        return answer;
    }
	

}
