package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �⺻����2_�Ҽ�ã�� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		/*
		 * StringTokenizer(���ڿ�, ������, ����/������)
		 * ������ �⺻���� ����
		 */
		
		boolean check = true;
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(st.nextToken());
			
			if (number == 1) {
				check = false;
			} else {
				for (int j = 2; j <= Math.sqrt(number); j++) {
					if (number % j == 0) {
						check = false;
						break;
					}
				}
			}
			
			if (check) {
				cnt++;
			}
			
			check = true;
		}
		
		System.out.println(cnt);
		
		br.close();
	}

}
