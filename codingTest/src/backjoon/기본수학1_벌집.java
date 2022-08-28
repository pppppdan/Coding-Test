package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 기본수학1_벌집 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int n = 1;
		int tmp = 1;
		
		if (N == 1) {
			System.out.println(1);
		} else {
			while (N > tmp) {
				tmp += (6 * n);
				n++;
			}
			
			System.out.println(n);
		}
		
		br.close();
	}

}
