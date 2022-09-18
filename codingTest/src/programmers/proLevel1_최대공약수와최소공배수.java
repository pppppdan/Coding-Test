package programmers;

public class proLevel1_�ִ��������ּҰ���� {
	

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		solution(n, m);
	}
	
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        for (int i = 1; i <= Math.max(n, m); i++) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
			}
		}
        
        answer[1] = n * m / answer[0];
        
        return answer;
    }
	
	/*
	//��Ŭ���� ȣ���� - �� ���� �ִ������� ���ϴ� �˰���
	//2���� �ڿ��� a, b (a > b)�� ���� a�� b�� ���� �������� r�̶� �ϸ�,
	//a,b�� �ִ������� r,b�� �ִ������� ����.
	 * 
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        while (min != 0) {
			int r = max % min;
			max = min;
			min = r;
		}
        
        answer[0] = max;
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    */
	
	

}
