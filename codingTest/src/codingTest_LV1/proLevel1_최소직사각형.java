package codingTest_LV1;

import java.util.Arrays;

public class proLevel1_�ּ����簢�� {

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
        	
        	// �� �� �߿� ū ���� 0��°(����), ���� ���� 1��°(����)�� 
			if (x < y) {
				sizes[i][0] = y;
				sizes[i][1] = x;
			}
			
			//0��°(����) �߿� ���� ū ���� ã�� maxW
			//1��°(����) �߿� ���� ū ���� ã�� maxH
			maxW = Math.max(maxW, sizes[i][0]);
			maxH = Math.max(maxH, sizes[i][1]);
		}
        
        System.out.println(Arrays.deepToString(sizes)); //2���� �迭 ��� Arrays.deepToString()
        System.out.println("maxW - " + maxW + ", maxH - " + maxH);
        
        //���� ���ϸ� �ּ� ���簢�� ���̰� ����
        answer = maxW * maxH;
        
        System.out.println(answer);
        
        return answer;
    }

}
