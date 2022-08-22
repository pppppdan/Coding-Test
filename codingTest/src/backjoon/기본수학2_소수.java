package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 기본수학2_소수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = N;
		
		for (int i = M; i <= N; i++) {
			boolean check = true;
			
			if (i == 1) {
				check = false;
			} 
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			
			if (check) {
				sum += i;
				min = Math.min(min, i);
			}
		}
		
		if (sum != 0) {
			System.out.println(sum + "\n" + min);
		} else {
			System.out.println(-1);
		}
		
		br.close();
	}

}
