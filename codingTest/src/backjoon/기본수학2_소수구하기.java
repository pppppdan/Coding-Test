package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기본수학2_소수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		/* 
		int[] arr = new int[N + 1];
		int idx = M;
		
		for (int i = M; i <= N; i++) {
			arr[idx] = i;
			idx++;
		}
		
		arr[1] = 0;
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			for (int j = i * 2; j <= N; j += i) {
				if (arr[j] == 0) {
					continue;
				}
				
				arr[j] = 0;
			}
		}
		
		for (int i : arr) {
			if (i != 0) {
				System.out.println(i);
			}
		}
		*/
		
		//좋은 코딩
		boolean[] arr = new boolean[N + 1];
		arr[0] = arr[1] = true;
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			for (int j = i * 2; j <= N; j += i) {
				if (arr[j]) {
					continue;
				}
				
				arr[j] = true;
			}
		}

		StringBuilder sb = new StringBuilder();
		
		for (int i = M; i <= N; i++) {
			if (!arr[i]) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
