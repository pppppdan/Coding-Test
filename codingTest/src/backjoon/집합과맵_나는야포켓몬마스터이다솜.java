package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 집합과맵_나는야포켓몬마스터이다솜 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> numMap = new HashMap<>();
		HashMap<Integer, String> strMap = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			numMap.put(str, i + 1);
			strMap.put(i + 1, str);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			
			if (s.matches("^[0-9]*$")) {
				sb.append(strMap.get(Integer.parseInt(s))).append('\n');
			} else {
				sb.append(numMap.get(s)).append('\n');
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
