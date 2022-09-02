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
		
		//몸무게, 키 저장
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			wh[i][0] = Integer.parseInt(st.nextToken());
			wh[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//덩치 -> 몸무게, 키 둘 다 상대보다 커야 함
		for (int i = 0; i < N; i++) {
			int cnt = 1; //등수
			
			//상대가 자신보다 몸무게, 키 둘 다 크다면 등수++
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
