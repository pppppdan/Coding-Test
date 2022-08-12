package codingTest_LV1;

public class proLevel1_시저암호 {

	public static void main(String[] args) {
		String s = "C";
		int n = 25;
		
		solution(s, n);
	}
	
	public static String solution(String s, int n) {
        String answer = "";
        char ch;
        
        for (int i = 0; i < s.length(); i++) {
        	ch = s.charAt(i);
        	
        	if (ch == ' ') {
				answer += ch;
				continue;
			} 
        	
        	if (ch >= 'a' && ch <= 'z') {
				answer += ch + n > 'z' ? (char) (ch - 26 + n) : (char) (ch + n);
			} else {
				answer += ch + n > 'Z' ? (char) (ch - 26 + n) : (char) (ch + n);
			}
		}
        
        return answer;
    }
    

}
