package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 집합과맵_숫자카드2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] n = new int[N];
		HashMap<Integer, Integer> nMap = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(n);
		
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			int next = 0;
			
			for (int j = i + 1; j < N; j++) {
				if (n[i] == n[j]) {
					cnt++;
					next++;
				} else {
					break;
				}
			}
			
			nMap.put(n[i], cnt);
			i += next;
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			int mNum = Integer.parseInt(st.nextToken());
			
			if (nMap.containsKey(mNum)) {
				sb.append(nMap.get(mNum)).append(' ');
			} else {
				sb.append("0").append(' ');
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
