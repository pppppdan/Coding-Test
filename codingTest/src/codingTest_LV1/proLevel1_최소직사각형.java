package codingTest_LV1;

import java.util.Arrays;

public class proLevel1_최소직사각형 {

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		//int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		//int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		
		solution(sizes);
	}
	
	public static int solution(int[][] sizes) {
        int answer = 0;
        int x, y;
        int maxW = 0, maxH = 0;
        
        for (int i = 0; i < sizes.length; i++) {
        	x = sizes[i][0];
        	y = sizes[i][1];
        	
        	// 두 값 중에 큰 값을 0번째(가로), 작은 값을 1번째(세로)에 
			if (x < y) {
				sizes[i][0] = y;
				sizes[i][1] = x;
			}
			
			//0번째(가로) 중에 가장 큰 값을 찾아 maxW
			//1번째(세로) 중에 가장 큰 값을 찾아 maxH
			maxW = Math.max(maxW, sizes[i][0]);
			maxH = Math.max(maxH, sizes[i][1]);
		}
        
        System.out.println(Arrays.deepToString(sizes)); //2차원 배열 출력 Arrays.deepToString()
        System.out.println("maxW - " + maxW + ", maxH - " + maxH);
        
        //둘이 곱하면 최소 직사각형 넓이가 나옴
        answer = maxW * maxH;
        
        System.out.println(answer);
        
        return answer;
    }

}
