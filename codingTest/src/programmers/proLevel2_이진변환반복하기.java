package programmers;

import java.util.Arrays;

public class proLevel2_������ȯ�ݺ��ϱ� {

	public static void main(String[] args) {
		String s = "110010101001";
		
		System.out.println(Arrays.toString(solution(s)));
	}
	
	public static int[] solution(String s) {
        int[] answer = new int[2]; //cnt zero
        int cnt = 0; //������ȯ Ƚ��
        int zero = 0; //���ŵ� 0�� ����
        
        while (!s.equals("1")) {
        	int length = s.length();
        	s = s.replace("0", "");
        	int reLength = s.length();
        	
        	zero += length - reLength;
        	cnt++;
        	
        	s = Integer.toBinaryString(reLength);
		}
        
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
	
	
}
