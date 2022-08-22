package programmers_LV1;

public class proLevel1_문자열다루기기본 {

	public static void main(String[] args) {
		String s = "a234";
		
		solution(s);
	}
	
	public static boolean solution(String s) {
        boolean answer = false;
        
        if ((s.length() == 4 || s.length() == 6) && s.matches("^[0-9]*$")) {
			answer = true;
		}
        
        /*
         * ^[0-9]*$
         * 
         * ^ 패턴의 시작
         * [0-9] 0 ~ 9까지의 숫자
         * * 글자수 상관하지 않음
         * $ 패턴 종료
         * 
         * -> s가 숫자로만 이루어져 있는지 확인하는 정규표현식
         */
        
        System.out.println(answer);
        
        return answer;
    }

}
