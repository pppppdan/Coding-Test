package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 기본수학1_부녀회장이될테야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[][] resident = new int[15][15];
		
		for (int i = 0; i < resident.length; i++) {
			resident[i][1] = 1;	//1호는 무조건 1
			resident[0][i] = i; //0층
		}
		
		for (int i = 1; i < resident.length; i++) { //층
			for (int j = 2; j < resident.length; j++) { //호
				resident[i][j] = resident[i][j - 1] + resident[i - 1][j];
			}
		}
		
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine()); //층
			int n = Integer.parseInt(br.readLine()); //호
			
			System.out.println(resident[k][n]);
		}
		
		br.close();
	}
}
