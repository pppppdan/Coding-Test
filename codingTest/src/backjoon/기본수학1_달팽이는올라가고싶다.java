package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기본수학1_달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); //낮에 올라가는 높이
		int B = Integer.parseInt(st.nextToken()); //밤에 떨어지는 높이
		int V = Integer.parseInt(st.nextToken()); //총 높이
		
		int date = (V - B) / (A - B);
		
		if ((V - B) % (A - B) != 0) {
			date++;
		}
		
		System.out.println(date);
		
		br.close();
	}

}
