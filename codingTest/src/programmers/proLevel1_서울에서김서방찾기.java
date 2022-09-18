package programmers;

public class proLevel1_서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		
		solution(seoul);
	}
	
	/*
	 * String 불변 
	 * 	-> 문자열 연산 할 때마다 힙메모리에 인스턴스 생성
	 * 	-> 힙메모리에 Garbage 계속해서 생성 -> 힙메모리 부족 문제 발생 가능
	 * 
	 * 	- 여러 번 문자열 연산해야 할 경우 성능 좋지 않음
	 * 	- 불변 -> 멀티쓰레드 환경에서 안정
	 * 
	 * StringBuffer, StringBuilder 가변 
	 * 	-> 동일 객체에서 문자열 연산 가능
	 * 
	 * 	- StringBuffer : 동기화 지원 -> 멀티쓰레드 환경에서 안정
	 * 	- StringBulider : 동기화 지원 X / 단일쓰레드에서 StringBuffer보다 성능 좋음
	 */
	
	public static String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("김서방은 ");
        
        for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				sb.append(i);
				break;
			}
		}
        
        sb.append("에 있다");
        
        return sb.toString();
    }

}
