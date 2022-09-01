package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 브루트포스_블랙잭 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine());
		int[] number = new int[N];
		
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
					
					if (sum > M) {
						break;
					} else if (sum == M) {
						max = sum;
						break Loop;
					} else if (max < sum && sum < M) {
						max = sum;
					}
					
				}
			}
		}
		
		System.out.println(max);
		
		br.close();
	}

}
