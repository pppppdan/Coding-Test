package codingTest_LV1;

public class proLevel1_가운데글자가져오기 {

	public static void main(String[] args) {
		String s = "abcde";
		
		solution(s);
	}
	
	public static String solution(String s) {
        int center = s.length() / 2;
        
        String answer = s.length() % 2 == 1 ? s.substring(center, center + 1) : s.substring(center - 1, center + 1);
		
		System.out.println(answer);
		
        return answer;
        
        /*
        String answer;
        
		if (s.length() % 2 == 1) {
			answer = s.charAt(s.length() / 2) + "";
		} else {
			answer = s.charAt(s.length() / 2 - 1) + "" + s.charAt(s.length() / 2);
		}
		
        return answer;
        */
    }

}
