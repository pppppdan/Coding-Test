package programmers_LV1;

public class proLevel1_신규아이디추천 {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		//String new_id = "abcdefghijklmn.p";
		//String new_id = "z-+.^.";
		//String new_id = "=.=";
		
		solution(new_id);
	}
	
	public static String solution(String new_id) {
		StringBuilder sb = new StringBuilder();
		
		//1 ~ 4단계
		sb.append(new_id.toLowerCase().replaceAll("[^-_.a-z0-9]", "").replaceAll("[.]+", ".").replaceAll("^[.]|[.]$", ""));
		
		System.out.println(sb.toString());
		
		//5단계
		if (sb.length() == 0) {
			sb.append("a");
		}
		
		//6단계
		if (sb.length() >= 16) {
			sb.delete(15, sb.length());
			
			if (sb.lastIndexOf(".") == 14) {
				sb.delete(14, 15);
			}
		}
		
		//7단계
		if (sb.length() <= 2) {
			while (sb.length() < 3) {
				sb.append(sb.substring(sb.length() - 1));
			}
		}
		
		System.out.println(sb.toString());
		
		return sb.toString();
    }

}
