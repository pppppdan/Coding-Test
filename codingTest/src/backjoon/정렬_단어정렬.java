package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ����_�ܾ����� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<>(); //�ߺ� ����
		
		for (int i = 0; i < N; i++) {
			hs.add(br.readLine());
		}
		
		List<String> list = new ArrayList<>(hs);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//���̰� ���� ������ ���̷� �������� ����
				//���̰� ������ ���ڿ� �������� ����
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
