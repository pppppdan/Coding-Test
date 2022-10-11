package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ����1_�׹�°�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		if (x[0] == x[1]) {
			System.out.print(x[2] + " ");
		} else if (x[1] == x[2]) {
			System.out.print(x[0] + " ");
		}
		
		if (y[0] == y[1]) {
			System.out.print(y[2]);
		} else if (y[1] == y[2]) {
			System.out.print(y[0]);
		}
		
		br.close();
	}

}
