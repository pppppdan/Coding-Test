package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ���հ���_��Ī������ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < a; i++) {
			map.put(Integer.parseInt(st.nextToken()), 0);
		}
		
		st = new StringTokenizer(br.readLine());
		int cnt = 0; //�ߺ� ����
		
		for (int i = 0; i < b; i++) {
			int bNum = Integer.parseInt(st.nextToken());
			
			if (map.containsKey(bNum)) {
				cnt++;
			} else {
				map.put(bNum, 0);
			}
		}
		
		System.out.println(map.size() - cnt);
		
		br.close();
	}

}
