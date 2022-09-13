package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ÁýÇÕ°ú¸Ê_µèº¸Àâ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken()); 
		HashMap<String, Integer> nameList = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			nameList.put(br.readLine(), 0);
		}
		
		int cnt = 0;
		
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			
			if (nameList.containsKey(name)) {
				cnt++;
				list.add(name);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(cnt).append('\n');
		
		Collections.sort(list);
		
		for (String s : list) {
			sb.append(s).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
