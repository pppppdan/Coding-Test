package programmers_LV1;

import java.util.Arrays;

public class proLevel1_예산 {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;

		//int[] d = {2,2,3,3};
		//int budget = 10;
		
		solution(d, budget);
	}
	
	
	public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        //정렬해서 낮은 신청 금액부터 합하기
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
			sum += d[i];
			
			//신청 금액 합이 예산보다 커지면
			//지원할 수 있는 최대 부서 수(answer)는 i 개
			//for문을 나감
			if (sum > budget) {
				answer = i;
				break;
			}
		}
        
        //만약 for문을 다 돌고도 신청 금액 합이 예산 이하라면
        //부서 전체를 지원 가능 한 것 == answer
        if (sum <= budget) {
        	answer = d.length;
        }
        
        return answer;
    }
}
