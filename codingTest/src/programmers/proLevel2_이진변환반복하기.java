package programmers;

import java.util.Arrays;

public class proLevel2_이진변환반복하기 {

	public static void main(String[] args) {
		String s = "110010101001";
		
		System.out.println(Arrays.toString(solution(s)));
	}
	
	public static int[] solution(String s) {
        int[] answer = new int[2]; //cnt zero
        int cnt = 0; //이진변환 횟수
        int zero = 0; //제거된 0의 개수
        
        while (!s.equals("1")) {
        	int length = s.length();
        	s = s.replace("0", "");
        	int reLength = s.length();
        	
        	zero += length - reLength;
        	cnt++;
        	
        	s = Integer.toBinaryString(reLength);
		}
        
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
	
	
}
