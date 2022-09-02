package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 브루트포스_분해합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strN = br.readLine();
		int N = Integer.parseInt(strN);
		int Nlength = strN.length(); //N의 자리수
		int result = 0;
		
		//만약 세자리 수 라면
		//각 자리수의 합의 최대값은 3 * 9 
		for (int i = N - Nlength * 9; i < N; i++) {
			int n = i;
			int sum = 0; //각 자리수의 합

			while (n != 0) {
				sum += n % 10;
				n /= 10;
			}

			if (sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);

		br.close();
	}

}
