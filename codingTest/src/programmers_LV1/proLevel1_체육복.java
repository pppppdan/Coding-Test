package programmers_LV1;

import java.util.Arrays;

public class proLevel1_ü���� {

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
		
		//������ ü���� �ִ� �л��� �������� ��� �׽�Ʈ
		int[] lost = {2, 3, 4, 5};
		int[] reserve = {2, 3, 7};
		
		solution(n, lost, reserve);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        //�̰� ���ϸ� �׽�Ʈ ����� �ȵ�,,
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //������ ü���� �ִ� �л��� �������� ���, ������ �� �����Ƿ� -1�� ����
        //�迭���� -1�� �����ϴ� ���� : +-1 �� �� if�� ���ǿ� �������� �ʰ� �Ϸ���
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
        
        //�Ϲ� �л��� �������� ���, ������ �л��� -1�� ����
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
