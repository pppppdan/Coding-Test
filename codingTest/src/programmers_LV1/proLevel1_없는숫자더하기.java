package programmers_LV1;

import java.util.Arrays;

public class proLevel1_없는숫자더하기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		//int[] numbers = {5,8,4,0,6,7,9};
		
		solution(numbers);
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		int check = 0;
		
		//정렬해야 더 빨리 찾을 수 있을 거 같아서..?
		Arrays.sort(numbers); //[0, 4, 5, 6, 7, 8, 9]
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < numbers.length; j++) {
				//같은 수 있으면 for j 나가고 그 다음 숫자 비교
				//같은 수 없으면 check 증가
				if (numbers[j] == i) {
					break;
				} else {
					check++;
				}
			}	
			
			//check 와 numbers.length 같으면 numbers 배열 안에 i가 없다는 의미
			//따라서 없는 숫자인 i 누적해서 더해줌
			if (check == numbers.length) {
				answer += i;
			}
			
			//check 초기화
			check = 0;
		}
		
		System.out.println(answer);

		return answer;
	}

}
