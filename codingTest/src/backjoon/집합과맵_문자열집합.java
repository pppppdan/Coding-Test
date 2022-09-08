package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ���հ���_���ڿ����� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> sMap = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			sMap.put(br.readLine(), 0);
		}
		
		int cnt = 0;
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			
			if (sMap.containsKey(str)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
		br.close();
	}

}
