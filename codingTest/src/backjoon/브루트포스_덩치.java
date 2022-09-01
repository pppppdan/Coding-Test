package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 브루트포스_덩치 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] wh = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			wh[i][0] = Integer.parseInt(st.nextToken());
			wh[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				} else if (wh[i][0] < wh[j][0] && wh[i][1] < wh[j][1]) {
					cnt++;
				}
			}
			
			System.out.print(cnt + " ");
		}
		
		br.close();
	}

}
