package codingTest_LV1;

import java.util.Arrays;

public class proLevel1_모의고사 {

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		//int[] answers = {1,3,2,4,2};

		solution(answers);
	}

	public static int[] solution(int[] answers) {
        int[] answer;
        
        //수포자가 찍는 방식에서 반복되는 부분을 배열로 선언 
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        //점수를 넣을 배열 선언
        int[] score = new int[3];
        
        //정답과 일치하는지 확인해서 점수 등록
        for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[i % 5]) {
				score[0]++;
			}
			
			if (answers[i] == student2[i % 8]) {
				score[1]++;
			}
			
			if (answers[i] == student3[i % 10]) {
				score[2]++;
			}
		}
        
        System.out.println("맞은 개수 : " + Arrays.toString(score));
        
        //최고점 찾기
        int maxScore = 0;
        
        for (int i = 0; i < score.length; i++) {
        	maxScore = Math.max(maxScore, score[i]);
		}
        
        //최고점을 가진 학생이 몇명인지 확인하고
        //그 학생 수만큼 answer 배열 크기 지정 
        int maxScoreStudent = 0;
        
        for (int i = 0; i < score.length; i++) {
			if (maxScore == score[i]) {
				maxScoreStudent++;
			}
		}
        
        answer = new int[maxScoreStudent];
        
        //answer 배열에 최고점을 가진 학생의 번호 넣기
        int idx = 0;
        for (int i = 0; i < score.length; i++) {
        	if (maxScore == score[i]) {
				answer[idx] = i + 1;
				idx++;
			}
		}
        
        //정렬하지 않아도 학생 번호가 오름차순으로 들어감
        //Arrays.sort(answer);
        
        System.out.println("최고점인 학생 번호 : " + Arrays.toString(answer));

        return answer;
	}

}
