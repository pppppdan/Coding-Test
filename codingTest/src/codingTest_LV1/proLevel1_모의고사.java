package codingTest_LV1;

import java.util.Arrays;

public class proLevel1_���ǰ�� {

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		//int[] answers = {1,3,2,4,2};

		solution(answers);
	}

	public static int[] solution(int[] answers) {
        int[] answer;
        
        //�����ڰ� ��� ��Ŀ��� �ݺ��Ǵ� �κ��� �迭�� ���� 
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        //������ ���� �迭 ����
        int[] score = new int[3];
        
        //����� ��ġ�ϴ��� Ȯ���ؼ� ���� ���
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
        
        System.out.println("���� ���� : " + Arrays.toString(score));
        
        //�ְ��� ã��
        int maxScore = 0;
        
        for (int i = 0; i < score.length; i++) {
        	maxScore = Math.max(maxScore, score[i]);
		}
        
        //�ְ����� ���� �л��� ������� Ȯ���ϰ�
        //�� �л� ����ŭ answer �迭 ũ�� ���� 
        int maxScoreStudent = 0;
        
        for (int i = 0; i < score.length; i++) {
			if (maxScore == score[i]) {
				maxScoreStudent++;
			}
		}
        
        answer = new int[maxScoreStudent];
        
        //answer �迭�� �ְ����� ���� �л��� ��ȣ �ֱ�
        int idx = 0;
        for (int i = 0; i < score.length; i++) {
        	if (maxScore == score[i]) {
				answer[idx] = i + 1;
				idx++;
			}
		}
        
        //�������� �ʾƵ� �л� ��ȣ�� ������������ ��
        //Arrays.sort(answer);
        
        System.out.println("�ְ����� �л� ��ȣ : " + Arrays.toString(answer));

        return answer;
	}

}
