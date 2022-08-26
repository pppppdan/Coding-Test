package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִ�
public class �⺻����2_������������ {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		boolean[] primeNumber = new boolean[10001];
		primeNumber[0] = primeNumber[1] = true;
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			for (int j = 2; j <= Math.sqrt(num); j++) {
				for (int k = j * 2; k <= num; k += j) {
					if (primeNumber[k]) {
						continue;
					}
					
					primeNumber[k] = true;
				}
			}
			
			int min = 0;
			int max = 0;
			
			for (int j = num / 2; j < num; j++) {
				if (!primeNumber[j] && !primeNumber[num - j]) {
					min = num - j;
					max = j;
					break;
				}
			}
			
			System.out.println(min + " " + max);
		}
		
		br.close();
	}

}
