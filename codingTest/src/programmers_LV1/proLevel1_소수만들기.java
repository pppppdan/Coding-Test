package programmers_LV1;

public class proLevel1_�Ҽ������ {

	public static void main(String[] args) {
		//int[] nums = {1,2,3,4};
		int[] nums = {1,2,7,6,4};
		
		solution(nums);
	}
	
	
	public static int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        boolean primeNumberCheck = true; //�Ҽ����� üũ�� ����
        
        for (int i = 0; i < nums.length - 2; i++) {
        	for (int j = i + 1; j < nums.length - 1; j++) {
        		for (int k = j + 1; k < nums.length; k++) {
        			sum = nums[i] + nums[j] + nums[k];
        			
        			
        			//1�� �ڱ� �ڽ��� ������ ���� ������ �������ٸ�
        			//(�Ҽ��� �ƴ϶��) primeNumberCheck = false & for�� ���
        			for (int x = 2; x < sum; x++) {
						if (sum % x == 0) {
							primeNumberCheck = false;
							break;
						}
					}
        			
        			System.out.printf("[ %d, %d, %d ] sum = %d, �Ҽ� = %b\n",
        					nums[i], nums[j], nums[k], sum, primeNumberCheck);
        			
        			//�Ҽ����� üũ
        			if (primeNumberCheck) {
						answer++;
					}
        			
        			//�Ҽ� üũ�ϴ� primeNumberCheck �ʱ�ȭ
        			primeNumberCheck = true;
				}
			}
		}
        
        System.out.println("�Ҽ��� ���� : " + answer);
        
        return answer;
    }

}
