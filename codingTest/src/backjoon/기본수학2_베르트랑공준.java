package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵ�
public class �⺻����2_����Ʈ������ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] primeNumber = new boolean[246913];
		primeNumber[0] = primeNumber[1] = true;
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while (n != 0) {
			for (int i = 2; i <= Math.sqrt(n * 2); i++) {
				for (int j = i * 2; j <= n * 2; j += i) {
					if (primeNumber[j] == true) {
						continue;
					}
					
					primeNumber[j] = true;
				}
			}
			
			for (int i = n + 1; i <= n * 2; i++) {
				if (!primeNumber[i]) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			cnt = 0;
			
			n = Integer.parseInt(br.readLine());
		}
		
		br.close();
	}

}
