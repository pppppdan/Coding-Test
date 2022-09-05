package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 정렬_소트인사이드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		Integer[] arr = new Integer[N.length()];
		
		for (int i = 0; i < N.length(); i++) {
			arr[i] = N.charAt(i) - '0';
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (Integer num : arr) {
			System.out.print(num);
		}
		
		br.close();
	}

}
