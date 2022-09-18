package programmers;

public class proLevel1_수박수박수박수박수박수 {

	public static void main(String[] args) {
		int n = 3;
		
		solution(n);
	}
	
	public static String solution(int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < n; ++i) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }
        
        answer = sb.toString();
        
        return answer;
    }

}
