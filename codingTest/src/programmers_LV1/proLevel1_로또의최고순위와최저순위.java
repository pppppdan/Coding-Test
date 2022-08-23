package programmers_LV1;

public class proLevel1_�ζ����ְ�������������� {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		solution(lottos, win_nums);
	}
	
	/*
	 * ����	��÷ ����
		1	6�� ��ȣ�� ��� ��ġ
		2	5�� ��ȣ�� ��ġ
		3	4�� ��ȣ�� ��ġ
		4	3�� ��ȣ�� ��ġ
		5	2�� ��ȣ�� ��ġ
		6(��÷)	�� ��
	 */
	
	//�˾ƺ� �� ���� ��ȣ�� 0���� ǥ��
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int winNumCnt = 0;
        
        for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				zeroCnt++;
			}
			
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					winNumCnt++;
					break;
				}
			}
		}
        
        answer[0] = (winNumCnt + zeroCnt) > 1 ? 7 - (winNumCnt + zeroCnt) : 6;
        answer[1] = winNumCnt > 1 ? 7 - winNumCnt : 6;
        
        return answer;
    }

}
