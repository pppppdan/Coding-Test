package programmers;

public class proLevel1_¦����Ȧ�� {

	public static void main(String[] args) {
		int num = 3;
		
		solution(num);
	}
	
	public static String solution(int num) {
        String answer = "";
        
        if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
        
        return answer;
    }

}
