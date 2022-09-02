package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���Ʈ����_������ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strN = br.readLine();
		int N = Integer.parseInt(strN);
		int Nlength = strN.length(); //N�� �ڸ���
		int result = 0;
		
		//���� ���ڸ� �� ���
		//�� �ڸ����� ���� �ִ밪�� 3 * 9 
		for (int i = N - Nlength * 9; i < N; i++) {
			int n = i;
			int sum = 0; //�� �ڸ����� ��

			while (n != 0) {
				sum += n % 10;
				n /= 10;
			}

			if (sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);

		br.close();
	}

}
