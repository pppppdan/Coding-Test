package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀_피보나치수5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(Fibonacci(n));
		
		br.close();
	}

	private static int Fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} 
		
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

}
