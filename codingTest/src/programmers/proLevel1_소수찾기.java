package programmers;


public class proLevel1_�Ҽ�ã�� {

	public static void main(String[] args) {
		int n = 10;
		
		solution(n);
	}
	
	public static int solution(int n) {
		/*
		int answer = 0;
        boolean pnCheck = true;
        
        for (int i = 2; i <= n; i++) {
        	for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					pnCheck = false;
					break;
				}
			}
        	
        	if (pnCheck) {
				answer++;
			}
        	
        	pnCheck = true;
        }
        
        return answer;
        */
		
		
		//�����佺�׳׽��� ü �̿�
		int answer = 0;
		
		//�迭 ���� i���� �����ϰ� ���ֱ� ���� list ũ�� n+1�� ����
		int[] list = new int[n + 1];
		
		for (int i = 2; i <= n; i++) {
			list[i] = i;
		}
		
		for (int i = 2; i <= n; i++) {
			//�̹� 0���� ������ ���̶��(� ���� ������) ���� for�� ����
			if (list[i] == 0) {
				continue;
			}
			
			//i�� ������ i�� ��� 0���� ����
			for (int j = i * 2; j <= n; j += i) {
				list[j] = 0;
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			//list[i]�� 0�� �ƴ� �� == �Ҽ�
			if (list[i] != 0) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
		return answer;
    }

}
