package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기본수학2_소수찾기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		/*
		 * StringTokenizer(문자열, 구분자, 포함/미포함)
		 * 구분자 기본값은 공백
		 */
		
		boolean check = true;
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(st.nextToken());
			
			if (number == 1) {
				check = false;
			} else {
				for (int j = 2; j <= Math.sqrt(number); j++) {
					if (number % j == 0) {
						check = false;
						break;
					}
				}
			}
			
			if (check) {
				cnt++;
			}
			
			check = true;
		}
		
		System.out.println(cnt);
		
		br.close();
	}

}
