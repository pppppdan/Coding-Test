package programmers_LV1;

public class proLevel1_로또의최고순위와최저순위 {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		solution(lottos, win_nums);
	}
	
	/*
	 * 순위	당첨 내용
		1	6개 번호가 모두 일치
		2	5개 번호가 일치
		3	4개 번호가 일치
		4	3개 번호가 일치
		5	2개 번호가 일치
		6(낙첨)	그 외
	 */
	
	//알아볼 수 없는 번호를 0으로 표기
	
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
