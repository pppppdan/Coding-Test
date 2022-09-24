package programmers;

import java.util.Arrays;

public class proLevel2_ī�� {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		
		System.out.println(Arrays.toString(solution(brown, yellow)));
	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int extent = brown + yellow;
        int x = 0; //yellow ���� ����
        
        for (int i = 1; i <= yellow; i++) { //i�� yellow ���� ����
        	if (yellow % i == 0) {
        		x = yellow / i;
			} else {
				continue;
			}
			
			if ((i + 2) * (x + 2) == extent) {
				answer[0] = x + 2;
				answer[1] = i + 2;
				break;
			}
		}
        
        return answer;
    }

}
