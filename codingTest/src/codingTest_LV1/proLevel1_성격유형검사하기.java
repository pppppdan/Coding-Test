package codingTest_LV1;

import java.util.Arrays;

public class proLevel1_성격유형검사하기 {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		
		solution(survey, choices);
	}
	
	//매우 동의/비동의 - 3점
	//동의/비동의 - 2점
	//약간 동의/비동의 - 1점
	//모르겠음 0점
	
	/*
	 * choices	뜻
		1	매우 비동의			왼
		2	비동의
		3	약간 비동의
		4	모르겠음
		5	약간 동의
		6	동의
		7	매우 동의			오
	 */
	
	/*
	 * 지표 번호	성격 유형
		1번 지표	라이언형(R), 튜브형(T)
		2번 지표	콘형(C), 프로도형(F)
		3번 지표	제이지형(J), 무지형(M)
		4번 지표	어피치형(A), 네오형(N)
	 */
	
	//점수 같을 경우 사전상 빠른 알파벳으로
	public static String solution(String[] survey, int[] choices) {
		String[] character = {"R", "T", "C", "F", "J", "M", "A", "N"};
		int[] score = {3, 2, 1, 0, 1, 2, 3};
		int[] characterScore = new int[character.length];
		
		for (int i = 0; i < survey.length; i++) {
			for (int j = 0; j < character.length; j++) {
				if (choices[i] <= 4) {
					if (character[j].equals(survey[i].substring(0, 1))) {
						characterScore[j] += score[choices[i] - 1];
						break;
					}
				} else {
					if (character[j].equals(survey[i].substring(1))) {
						characterScore[j] += score[choices[i] - 1];
						break;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(characterScore));
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < characterScore.length; i += 2) {
			if (characterScore[i] >= characterScore[i + 1]) {
				sb.append(character[i]);
			} else {
				sb.append(character[i + 1]);
			}
		}
		
		String answer = sb.toString();
        
        return answer;
    }

}
