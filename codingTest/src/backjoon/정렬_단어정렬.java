package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class 정렬_단어정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<>(); //중복 제거
		
		for (int i = 0; i < N; i++) {
			hs.add(br.readLine());
		}
		
		List<String> list = new ArrayList<>(hs);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//길이가 같지 않으면 길이로 오름차순 정렬
				//길이가 같으면 문자열 오름차순 정렬
				return o1.length() != o2.length() ? o1.length() - o2.length() : o1.compareTo(o2);
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (String str : list) {
			sb.append(str).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
