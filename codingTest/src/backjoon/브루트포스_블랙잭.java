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
		
		int N = Integer.parseInt(st.nextToken()); //카드 개수
		int M = Integer.parseInt(st.nextToken()); //기준
		
		st = new StringTokenizer(br.readLine());
		int[] number = new int[N]; //카드 번호 저장할 배열
		
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
					
					if (sum > M) { //카드 3개 합이 M보다 큰 경우
						break;
					} else if (sum == M) { //카드 3개 합이 M과 같은 경우
						max = sum;
						break Loop; //삼중 for문 나감
					} else if (max < sum && sum < M) { //카드 3개 합이 M보다 작은 경우
						max = sum; //가장 M과 가까운 수를 max에 저장
					}
					
				}
			}
		}
		
		System.out.println(max);
		
		br.close();
	}

}
