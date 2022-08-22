package programmers_LV1;

public class proLevel1_소수만들기 {

	public static void main(String[] args) {
		//int[] nums = {1,2,3,4};
		int[] nums = {1,2,7,6,4};
		
		solution(nums);
	}
	
	
	public static int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        boolean primeNumberCheck = true; //소수인지 체크할 변수
        
        for (int i = 0; i < nums.length - 2; i++) {
        	for (int j = i + 1; j < nums.length - 1; j++) {
        		for (int k = j + 1; k < nums.length; k++) {
        			sum = nums[i] + nums[j] + nums[k];
        			
        			
        			//1과 자기 자신을 제외한 수로 나누어 떨어진다면
        			//(소수가 아니라면) primeNumberCheck = false & for문 벗어남
        			for (int x = 2; x < sum; x++) {
						if (sum % x == 0) {
							primeNumberCheck = false;
							break;
						}
					}
        			
        			System.out.printf("[ %d, %d, %d ] sum = %d, 소수 = %b\n",
        					nums[i], nums[j], nums[k], sum, primeNumberCheck);
        			
        			//소수인지 체크
        			if (primeNumberCheck) {
						answer++;
					}
        			
        			//소수 체크하는 primeNumberCheck 초기화
        			primeNumberCheck = true;
				}
			}
		}
        
        System.out.println("소수의 개수 : " + answer);
        
        return answer;
    }

}
