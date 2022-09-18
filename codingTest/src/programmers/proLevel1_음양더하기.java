package programmers;


public class proLevel1_음양더하기 {

	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		//int[] absolutes = {1, 2, 3};
		
		boolean[] signs = {true,false,true};
		//boolean[] signs = {false,false,true};
		
		solution(absolutes, signs);
	}
	
	
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
        	absolutes[i] *= signs[i] ? 1 : -1;
        	answer += absolutes[i];
		}
        
        //System.out.println(answer);
        return answer;
    }

}
