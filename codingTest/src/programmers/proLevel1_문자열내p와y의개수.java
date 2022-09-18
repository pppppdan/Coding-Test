package programmers;

public class proLevel1_문자열내p와y의개수 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		
		solution(s);
	}
	
	static boolean solution(String s) {
        boolean answer = false;
        int pCnt = 0;
        int yCnt = 0;
        
        s = s.toUpperCase();
        
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'P') {
				pCnt++;
			} else if (s.charAt(i) == 'Y') {
				yCnt++;
			}
		}
        
        if (pCnt == yCnt) {
			answer = true;
		}

        return answer;
    }

}
