package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 정렬_통계학 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
		}
		
		//산술평균 - 소수점 첫째자리에서 반올림
		System.out.println((int)Math.round((double)sum / N));
		
		//중앙값
		Arrays.sort(num);
		
		System.out.println(num[N / 2]);
		
		//최빈값
		int cntMax = 0;
		int val = 0;
		boolean check = false;
		
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			int next = 0; //같은 값 개수
			
			for (int j = i + 1; j < N; j++) {
				if (num[i] != num[j]) {
					break;
				}
				
				cnt++;
				next++;
			}
			
			if (cntMax < cnt) {
				cntMax = cnt;
				val = num[i];
				check = true;
			} else if (cnt == cntMax && check == true) { //최빈값 중 두 번째로 작은 값
				val = num[i];
				check = false;
			}
			
			i += next;
		}
		
		System.out.println(val);
		
		//범위
		System.out.println(num[N - 1] - num[0]);
		
		br.close();
	}

}
