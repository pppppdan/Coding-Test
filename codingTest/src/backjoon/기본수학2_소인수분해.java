package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 기본수학2_소인수분해 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while(N % i == 0) {
				N /= i;
				System.out.println(i);
			}
		}
		
		if (N != 1) {
			System.out.println(N);
		}
		
		br.close();
	}

}
