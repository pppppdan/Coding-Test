package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ���Ʈ����_���� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //ī�� ����
		int M = Integer.parseInt(st.nextToken()); //����
		
		st = new StringTokenizer(br.readLine());
		int[] number = new int[N]; //ī�� ��ȣ ������ �迭
		
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(number);
		
		int sum = 0;
		int max = 0;
		
		Loop:
		for (int i = 0; i < number.length - 2; i++) {
			for (int j = i + 1; j < number.length - 1; j++) {
				for (int k = j + 1; k < number.length; k++) {
					sum = number[i] + number[j] + number[k];
					
					if (sum > M) { //ī�� 3�� ���� M���� ū ���
						break;
					} else if (sum == M) { //ī�� 3�� ���� M�� ���� ���
						max = sum;
						break Loop; //���� for�� ����
					} else if (max < sum && sum < M) { //ī�� 3�� ���� M���� ���� ���
						max = sum; //���� M�� ����� ���� max�� ����
					}
					
				}
			}
		}
		
		System.out.println(max);
		
		br.close();
	}

}
