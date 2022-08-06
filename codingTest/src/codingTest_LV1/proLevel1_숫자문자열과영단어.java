package codingTest_LV1;

public class proLevel1_숫자문자열과영단어 {

	public static void main(String[] args) {
		//String s = "one4seveneight";
		String s = "23four5six7";
		
		solution(s);
	}
	
	public static int solution(String s) {
        int answer = 0;
        String[] number = 
        	{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        //s에 있는 영어를 숫자로 바꾸기
        //replace(String, String) 때문에 i를 String으로 형변환
        for (int i = 0; i < number.length; i++) {
			s = s.replace(number[i], Integer.toString(i));
		}
        
        //s는 숫자 문자열이기 때문에 다시 int로 형변환
        answer = Integer.parseInt(s);
        
        System.out.println(answer);
        
        return answer;
    }

}
