package codingTest_LV1;

public class proLevel1_���ڹ��ڿ������ܾ� {

	public static void main(String[] args) {
		//String s = "one4seveneight";
		String s = "23four5six7";
		
		solution(s);
	}
	
	public static int solution(String s) {
        int answer = 0;
        String[] number = 
        	{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        //s�� �ִ� ��� ���ڷ� �ٲٱ�
        //replace(String, String) ������ i�� String���� ����ȯ
        for (int i = 0; i < number.length; i++) {
			s = s.replace(number[i], Integer.toString(i));
		}
        
        //s�� ���� ���ڿ��̱� ������ �ٽ� int�� ����ȯ
        answer = Integer.parseInt(s);
        
        System.out.println(answer);
        
        return answer;
    }

}
