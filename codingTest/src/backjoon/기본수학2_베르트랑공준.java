package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다
public class 기본수학2_베르트랑공준 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] primeNumber = new boolean[246913];
		primeNumber[0] = primeNumber[1] = true;
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while (n != 0) {
			for (int i = 2; i <= Math.sqrt(n * 2); i++) {
				for (int j = i * 2; j <= n * 2; j += i) {
					if (primeNumber[j] == true) {
						continue;
					}
					
					primeNumber[j] = true;
				}
			}
			
			for (int i = n + 1; i <= n * 2; i++) {
				if (!primeNumber[i]) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			cnt = 0;
			
			n = Integer.parseInt(br.readLine());
		}
		
		br.close();
	}

}
