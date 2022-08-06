package codingTest_LV1;

import java.util.ArrayList;
import java.util.Collections;

public class proLevel1_3진법뒤집기 {
	public static void main(String[] args) {
		int n = 45; //45(10) => 1200(3) -> 반전 -> 0021(3) => 7(10)
		//int n = 125;
		
		solution(n);
	}
	
	
	public static int solution(int n) {
        int answer = 0;
        int remainder;
        ArrayList<Integer> list = new ArrayList<>(); 
        
        while (n > 0) {
        	remainder = n % 3;
			n = n / 3;
			list.add(remainder);
		}
        // 45 / 3 -> n = 15 / remainder = 0
        // 15 / 3 -> n = 5 / remainder = 0
        // 5 / 3 -> n = 1 / remainder = 2
        // 1 / 3 -> n = 0 / remainder = 1
        
        //System.out.println(list); //[0,0,2,1]
        Collections.reverse(list); 
        //System.out.println(list); //[1,2,0,0]
        
        for (int i = 0; i < list.size(); i++) {
			answer += list.get(i) * Math.pow(3, i);
		}
	    // i = 0 -> answer = 1 * 3^0 
	    // i = 1 -> answer = 1 * 3^0 + 2 * 3^1
	    // i = 2 -> answer = 1 * 3^0 + 2 * 3^1 + 0 * 3^2
	    // i = 3 -> answer = 1 * 3^0 + 2 * 3^1 + 0 * 3^2 + 0 * 3^3
        
        //System.out.println(answer);
        
        return answer;
    }
	
}
