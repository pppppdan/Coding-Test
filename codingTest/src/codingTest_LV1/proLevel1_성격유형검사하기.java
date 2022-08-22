package codingTest_LV1;

import java.util.Arrays;

public class proLevel1_���������˻��ϱ� {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		
		solution(survey, choices);
	}
	
	//�ſ� ����/���� - 3��
	//����/���� - 2��
	//�ణ ����/���� - 1��
	//�𸣰��� 0��
	
	/*
	 * choices	��
		1	�ſ� ����			��
		2	����
		3	�ణ ����
		4	�𸣰���
		5	�ణ ����
		6	����
		7	�ſ� ����			��
	 */
	
	/*
	 * ��ǥ ��ȣ	���� ����
		1�� ��ǥ	���̾���(R), Ʃ����(T)
		2�� ��ǥ	����(C), ���ε���(F)
		3�� ��ǥ	��������(J), ������(M)
		4�� ��ǥ	����ġ��(A), �׿���(N)
	 */
	
	//���� ���� ��� ������ ���� ���ĺ�����
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
