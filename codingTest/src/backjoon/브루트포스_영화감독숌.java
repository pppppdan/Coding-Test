package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 브루트포스_영화감독숌 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int num = 666;
		
		while (cnt != N) {
			num++;
			
			if (String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(num);
		
		br.close();
	}

}
