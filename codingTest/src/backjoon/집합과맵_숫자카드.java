package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 집합과맵_숫자카드 { //이분탐색

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			int n = Integer.parseInt(st.nextToken());
			int startIdx = 0;
			int midIdx = 0;
			int endIdx = N - 1;
			boolean check = false;
			
			while (startIdx <= endIdx) {
				midIdx = (startIdx + endIdx) / 2;
				
				if (n < num[midIdx]) {
					endIdx = midIdx - 1;
				} else if (n > num[midIdx]) {
					startIdx = midIdx + 1;
				} else {
					check = true;
					break;
				}
			}
			
			if (check) {
				sb.append("1").append(' ');
			} else {
				sb.append("0").append(' ');
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
