package programmers_LV1;

public class proLevel1_���ڿ��ٷ��⺻ {

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
         * ^ ������ ����
         * [0-9] 0 ~ 9������ ����
         * * ���ڼ� ������� ����
         * $ ���� ����
         * 
         * -> s�� ���ڷθ� �̷���� �ִ��� Ȯ���ϴ� ����ǥ����
         */
        
        System.out.println(answer);
        
        return answer;
    }

}
