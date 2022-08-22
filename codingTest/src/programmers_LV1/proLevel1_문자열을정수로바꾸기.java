package programmers_LV1;

public class proLevel1_문자열을정수로바꾸기 {

	public static void main(String[] args) {
		String s = "-1234";
		
		solution(s);
	}
	
	public static int solution(String s) {
        int answer = Integer.parseInt(s);
        
        return answer;
    }

}
