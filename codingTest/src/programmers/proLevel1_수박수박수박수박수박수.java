package programmers;

public class proLevel1_���ڼ��ڼ��ڼ��ڼ��ڼ� {

	public static void main(String[] args) {
		int n = 3;
		
		solution(n);
	}
	
	public static String solution(int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < n; ++i) {
            sb.append(i % 2 == 0 ? "��" : "��");
        }
        
        answer = sb.toString();
        
        return answer;
    }

}
