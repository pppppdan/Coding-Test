package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 브루트포스_체스판다시칠하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		boolean[][] wb = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			
			for (int j = 0; j < M; j++) {
				if (line.charAt(j) == 'W') {
					wb[i][j] = true;
				} else {
					wb[i][j] = false;
				}
			}
		}
		
		int min = 64;
		
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				boolean check = wb[i][j];
				int cnt = 0;
				
				for (int x = i; x < i + 8; x++) {
					for (int y = j; y < j + 8; y++) {
						if (wb[x][y] != check) {
							cnt++;
						}
						
						check = (!check);
					}
					check = !check;
				}
				
				cnt = Math.min(64 - cnt, cnt);
				min = Math.min(min, cnt);
			}
		}
		
		System.out.println(min);
		
		br.close();
	}

}
