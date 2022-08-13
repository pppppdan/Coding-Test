package codingTest_LV1;

public class proLevel1_시저암호 {

	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		
		solution(s, n);
	}
	
	public static String solution(String s, int n) {
        String answer = "";
        char ch;
        
        for (int i = 0; i < s.length(); i++) {
        	ch = s.charAt(i);
        	
        	if (ch == ' ') {
				answer += " ";
				continue;
			} 
        	
        	if (ch >= 'a' && ch <= 'z') { //소문자
				answer += ch + n > 'z' ? (char) (ch + n - 26) : (char) (ch + n);
			} else { //대문자
				answer += ch + n > 'Z' ? (char) (ch + n - 26) : (char) (ch + n);
			}
		}
        
        return answer;
    }
    

}
