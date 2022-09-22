package programmers;

public class proLevel2_다음큰숫자 {

	public static void main(String[] args) {
		int n = 78;
		
		System.out.println(solution(n));
	}
	
	/*
	public static int solution(int n) {
		String nBi = Integer.toBinaryString(n);
		nBi = nBi.replace("0", "");
		
		int len = nBi.length();
		
		while (true) {
			n++;
			
			String nextBi = Integer.toBinaryString(n);
			nextBi = nextBi.replace("0", "");
			
			int nextLen = nextBi.length();
			
			if (len == nextLen) {
				break;
			}
		}
		
		return n;
    }
	*/
	
	public static int solution(int n) {
		int nCnt = Integer.bitCount(n);
		
		while (true) {
			n++;
			
			int next = Integer.bitCount(n);
			
			if (nCnt == next) {
				break;
			}
		}
		
		return n;
	}

}
