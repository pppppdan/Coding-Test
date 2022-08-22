package programmers_LV1;

import java.util.ArrayList;
import java.util.Arrays;

public class proLevel1_�ΰ��̾Ƽ����ϱ� {

	public static void main(String[] args) {
		//int[] numbers = {2,1,3,4,1};
		int[] numbers = {5,0,2,7};
		
		solution(numbers);
	}
	
	public static int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum;
		
		for (int i = 0; i < numbers.length - 1; i++) {
        	for (int j = i + 1; j < numbers.length; j++) {				
        		sum = numbers[i] + numbers[j];
        		
        		//�ߺ��� �� ���� ��� list�� �߰����� �ʵ���
        		if (!list.contains(sum)) {
					list.add(sum);
				}
			}
		}
		// i = 0
		// 		j = 1  sum = 5 + 0 = 5
		// 		j = 2  sum = 5 + 2 = 7
		// 		j = 3  sum = 5 + 7 = 12
		// i = 1
		// 		j = 2  sum = 0 + 2 = 2
		//		j = 3  sum = 0 + 7 = 7 (�ߺ� -> list �� �߰����� ����)
		// i = 2
		//		j = 3  sum = 2 + 7 = 9
		// list�� [5, 7, 12, 2, 9]
		
		int[] answer = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
		// answer�� [2, 5, 7, 9, 12]
		
		//System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
