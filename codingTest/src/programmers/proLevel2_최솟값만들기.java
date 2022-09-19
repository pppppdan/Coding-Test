package programmers;

import java.util.Arrays;

public class proLevel2_최솟값만들기 {

	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
		System.out.println(solution(A, B));
	}
	
	public static int solution(int []A, int []B){
        Arrays.sort(A);
        Arrays.sort(B);
        
        int sum = 0;
        
        for (int i = 0; i < A.length; i++) {
			sum += A[i] * B[B.length - (1 + i)];
		}

        return sum;
    }

}
