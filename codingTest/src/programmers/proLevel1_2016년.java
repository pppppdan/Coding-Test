package programmers;

public class proLevel1_2016³â {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		solution(a, b);
	}
	
	public static String solution(int a, int b) {
		String[] dayOfWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
		int[] lastDate = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int allDate = 0;
		
		for (int i = 0; i < a - 1; i++) {
			allDate += lastDate[i];
		}
		
		allDate += b;
		
		String answer = dayOfWeek[allDate % 7];
		
        return answer;
    }

}
