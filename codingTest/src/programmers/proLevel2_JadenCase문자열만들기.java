package programmers;

public class proLevel2_JadenCase문자열만들기 {

	public static void main(String[] args) {
		String s = "3people   unFollowed me";
		
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String[] sArr = s.split("");
		boolean check = true;
        StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if (check && !sArr[i].equals(" ")) {
				sArr[i] = sArr[i].toUpperCase();
				check = false;
			} else if (sArr[i].equals(" ")) {
				check = true;
			} else {
				sArr[i] = sArr[i].toLowerCase();
			}
		}
		
		for (int i = 0; i < sArr.length; i++) {
			sb.append(sArr[i]);
		}
		
        return sb.toString();
    }

}
