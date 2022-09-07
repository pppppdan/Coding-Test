package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 정렬_좌표압축 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] x = new int[N];
		int[] sortX = new int[N];
		
		for (int i = 0; i < N; i++) {
			x[i] = sortX[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sortX);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int rank = 0;
		
		for (int i : sortX) {
			if (!map.containsKey(i)) {
				map.put(i, rank++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int key : x) {
			sb.append(map.get(key)).append(' ');
		}
		
		System.out.println(sb);
		
		br.close();
		
		/* 시간초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] x = new int[N];
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(st.nextToken());
			hs.add(x[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>(hs);
		
		Collections.sort(list);
		
		int[] rank = new int[list.size()];
		int idx = 0;
		
		for (int r : list) {
			rank[idx++] = r;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (x[i] == rank[j]) {
					sb.append(j).append(' ');
					break;
				}
			}
		}
		
		System.out.println(sb);
		
		br.close();
		*/
	}

}
