package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수론및조합론_최대공약수와최소공배수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int temp1 = Integer.parseInt(st.nextToken());
		int temp2 = Integer.parseInt(st.nextToken());
		
		int max = Math.max(temp1, temp2);
		int min = Math.min(temp1, temp2);
		
		while (min != 0) {
			int r = max % min;
			max = min;
			min = r;
		}
		
		System.out.println(max);
		System.out.println((temp1 * temp2) / max);
		
		br.close();
	}

}
