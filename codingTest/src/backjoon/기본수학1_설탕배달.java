package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 기본수학1_설탕배달 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int tmp = 0;
		
		if (N % 5 == 0) {
			cnt = N / 5;
		} else {
			tmp = N % 5;
			
			for (int i = N / 5; i >= 0; i--) {
				if (tmp % 3 == 0) {
					cnt = i + tmp / 3;
					tmp = 0;
					break;
				}
				
				tmp += 5;
			}
			
			if (tmp != 0) {
				cnt = -1;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}

}
