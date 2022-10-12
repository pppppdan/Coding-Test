package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수론및조합론_이항계수1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int num = 1;
		int deno = 1;
		
		for (int i = 2; i <= n; i++) {
			num *= i;
			
			if (i <= n - k) {
				deno *= i;
			}
			
			if (i <= k) {
				deno *= i;
			}
		}
		
		System.out.println(num / deno);
		
		br.close();
	}
}
