package programmers;

public class proLevel2_n�����ּҰ���� {

	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr) {
		int answer = 0;
		
		if (arr.length == 1) {
			return arr[0];
		} else {
			answer = euclidean(arr[0], arr[1]);
			
			for (int i = 2; i < arr.length; i++) {
				answer = euclidean(answer, arr[i]);
			}
		}
		
        return answer;
    }
	
	//��Ŭ���� ȣ���� - �� ���� �ִ������� ���ϴ� �˰���
	//2���� �ڿ��� a, b (a > b)�� ���� a�� b�� ���� �������� r�̶� �ϸ�,
	//a,b�� �ִ������� r,b�� �ִ������� ����.
	public static int euclidean(int n1, int n2) {
		int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        
        while (min != 0) {
			int r = max % min;
			max = min; 
			min = r;
		}
        
        return n1 * n2 / max; //max�� �ִ�����
	}

}
