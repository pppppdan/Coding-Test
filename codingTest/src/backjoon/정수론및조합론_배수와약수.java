package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수론및조합론_배수와약수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num1, num2;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			
			if (num1 == num2) {
				break;
			}
			
			if (num2 % num1 == 0) {
				System.out.println("factor");
			} else if (num1 % num2 == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
		
		br.close();
	}

}
