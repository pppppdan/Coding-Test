package programmers_LV1;

import java.util.Arrays;

public class proLevel1_���¼��ڴ��ϱ� {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		//int[] numbers = {5,8,4,0,6,7,9};
		
		solution(numbers);
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		int check = 0;
		
		//�����ؾ� �� ���� ã�� �� ���� �� ���Ƽ�..?
		Arrays.sort(numbers); //[0, 4, 5, 6, 7, 8, 9]
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < numbers.length; j++) {
				//���� �� ������ for j ������ �� ���� ���� ��
				//���� �� ������ check ����
				if (numbers[j] == i) {
					break;
				} else {
					check++;
				}
			}	
			
			//check �� numbers.length ������ numbers �迭 �ȿ� i�� ���ٴ� �ǹ�
			//���� ���� ������ i �����ؼ� ������
			if (check == numbers.length) {
				answer += i;
			}
			
			//check �ʱ�ȭ
			check = 0;
		}
		
		System.out.println(answer);

		return answer;
	}

}
