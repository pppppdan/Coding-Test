package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���_���丮�� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));
		
		br.close();
	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		
		return n *= factorial(n - 1);
	}

}
