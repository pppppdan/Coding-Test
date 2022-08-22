package programmers_LV1;

import java.util.Arrays;

public class proLevel1_체육복 {

	public static void main(String[] args) {
		int n = 5;
		//int[] lost = {2, 4};
		//int[] reserve = {1, 3, 5};
		//int[] reserve = {3};
		
		/*
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		*/
		
		//여벌의 체육복 있는 학생이 도난당한 경우 테스트
		int[] lost = {2, 3, 4, 5};
		int[] reserve = {2, 3, 7};
		
		solution(n, lost, reserve);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        //이거 안하면 테스트 통과가 안됨,,
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //여벌의 체육복 있는 학생이 도난당한 경우, 빌려줄 수 없으므로 -1로 설정
        //배열겂을 -1로 설정하는 이유 : +-1 할 때 if문 조건에 만족하지 않게 하려고
        for (int i = 0; i < lost.length; i++) {
        	for (int j = 0; j < reserve.length; j++) {
        		if(lost[i] == reserve[j]) {
        			answer++;
        			lost[i] = -1;
        			reserve[j] = -1;
        			break;
        		}
        	}
        }
        
        System.out.println("lost - " + Arrays.toString(lost));
        System.out.println("reserve - " + Arrays.toString(reserve));
        
        //일반 학생이 도난당한 경우, 빌려준 학생을 -1로 설정
        for (int i = 0; i < lost.length; i++) {
        	for (int j = 0; j < reserve.length; j++) {
        		if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
        			answer++;
        			reserve[j] = -1;
        			break;
        		}
			}
		}
        
        System.out.println("lost - " + Arrays.toString(lost));
        System.out.println("reserve - " + Arrays.toString(reserve));
        
        System.out.println(answer);
        
        return answer;
    }

}
