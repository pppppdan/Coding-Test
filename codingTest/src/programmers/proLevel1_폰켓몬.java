package programmers;


import java.util.HashSet;

public class proLevel1_ÆùÄÏ¸ó {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		//int[] nums = {3,3,3,2,2,4};
		//int[] nums = {3,3,3,2,2,2};
		
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
        int answer = 0;
        int getPokemon = nums.length / 2;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}
        
        if (hs.size() < getPokemon) {
			answer = hs.size();
		} else {
			answer = getPokemon;
		}
        
        return answer;
    }
}
