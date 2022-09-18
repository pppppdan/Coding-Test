package programmers;

import java.util.Arrays;

public class proLevel1_K��°�� {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(array, commands);
	}
	
	
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
    
        	int[] newArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
        	Arrays.sort(newArray);
        	
        	answer[i] = newArray[commands[i][2] - 1];
        	
        	//System.out.println(answer[i]);
        }//for
        
        return answer;
    }
}
