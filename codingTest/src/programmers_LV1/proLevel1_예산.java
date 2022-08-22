package programmers_LV1;

import java.util.Arrays;

public class proLevel1_���� {

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
        
        //�����ؼ� ���� ��û �ݾ׺��� ���ϱ�
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
			sum += d[i];
			
			//��û �ݾ� ���� ���꺸�� Ŀ����
			//������ �� �ִ� �ִ� �μ� ��(answer)�� i ��
			//for���� ����
			if (sum > budget) {
				answer = i;
				break;
			}
		}
        
        //���� for���� �� ���� ��û �ݾ� ���� ���� ���϶��
        //�μ� ��ü�� ���� ���� �� �� == answer
        if (sum <= budget) {
        	answer = d.length;
        }
        
        return answer;
    }
}
