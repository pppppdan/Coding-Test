package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �⺻����1_ACMȣ�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int roomNumber;
			
			if (N % H == 0) {
				roomNumber = H * 100 + N / H;
			} else {
				roomNumber = N % H * 100 + (N / H + 1);
			}
			
			System.out.println(roomNumber);
		}
		
		br.close();
	}

}
