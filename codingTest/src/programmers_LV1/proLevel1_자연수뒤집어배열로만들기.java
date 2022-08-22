package programmers_LV1;

public class proLevel1_자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		long n = 12345;
		
		solution(n);
	}
	
	public static int[] solution(long n) {
		String number = Long.toString(n);
        int[] answer = new int[number.length()];
        int idx = 0;
        
        for (int i = answer.length - 1; i >= 0 ; i--) {
			answer[idx] = Character.getNumericValue(number.charAt(i));
			idx++;
		}
        
        return answer;
    }

}
