package codingTest_LV1;

public class proLevel1_���ڼ��ڼ��ڼ��ڼ��ڼ� {

	public static void main(String[] args) {
		int n = 3;
		
		solution(n);
	}
	
	public static String solution(int n) {
        String answer = "";
        StringBuffer sf = new StringBuffer();
        
        for (int i = 0; i < n; ++i) {
            sf.append(i % 2 == 0 ? "��" : "��");
        }
        
        answer = sf.toString();
        
        return answer;
    }

}
