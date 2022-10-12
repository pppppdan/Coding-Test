package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수론및조합론_링 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int fRing = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i < n; i++) {
			int ring = Integer.parseInt(st.nextToken());
			
			int max = Math.max(fRing, ring);
			int min = Math.min(fRing, ring);
			int r = 1;
			
			while (r != 0) {
				r = max % min;
				max = min;
				min = r;
			}
			
			System.out.println(fRing / max + "/" + ring / max);
		}
		
		br.close();
	}
}
