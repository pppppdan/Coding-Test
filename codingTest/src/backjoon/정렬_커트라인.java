package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 정렬_커트라인 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //응시자 수
		int k = Integer.parseInt(st.nextToken()); //상 받는 사람의 수
		
		st = new StringTokenizer(br.readLine());
		Integer[] score = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(score, Collections.reverseOrder());
		
		System.out.println(score[k - 1]);
		
		br.close();
	}

}
