package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 정수론및조합론_검문 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int tmp = arr[1] - arr[0];
		
		for (int i = 2; i < n; i++) {
			tmp = gcd(tmp, arr[i] - arr[i - 1]);
		}
		
		for (int i = 2; i <= tmp; i++) {
			if (tmp % i == 0) {
				bw.write(i + " ");
			}
		}
		
		br.close();
		bw.flush();
        bw.close();
	}

	private static int gcd(int a, int b) {
		while (a != 0) {
			int r = b % a;
			b = a;
			a = r;
		}
		
		return b;
	}

}
