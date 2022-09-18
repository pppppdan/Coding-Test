package programmers;

public class proLevel1_�ϻ���� {
	//�ϻ��� �� : ���� ���� x�� x�� �ڸ����� ������ ������ ������ �� x�� '�ϻ��� ��' ��� ��

	public static void main(String[] args) {
		int x = 12;
		
		solution(x);
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        int xCopy = x;
        int sum = 0; //�ڸ����� ��
        int figures = 0; //�ڸ���
        
        //�ڸ��� ���ϱ�
        //12�� ���� �ڸ��� -> figures�� 2
        for (int i = 1; i <= x; i *= 10) {
        	if (x >= i) {
        		figures++;
			} else {
				break;
			}
		}
        
        //�ڸ��� ���ϱ�
        //12�� xCopy�� ������ 10���� ���� �� -> 1 -> sum�� ����
        //				   10���� ���� �������� 2�� xCopy�� ����
        //	  xCopy�� 1�� ���� �� -> 2 -> sum�� ����
        //			 1�� ���� ������ 0�� xCopy�� ���� -> for�� ����
        for (int i = figures - 1; i >= 0; i--) {
			sum += xCopy / Math.pow(10, i);
			xCopy = (int) (xCopy % Math.pow(10, i));
			
			if (xCopy == 0) {
				break;
			}
		}
        
        //sum���� x�� ���� �������ٸ� �ϻ��� �� (true)
        //�ƴ϶�� false
        if (x % sum != 0) {
			answer = false;
		}
        
        return answer;
    
        
        /* ���¿��� Ǯ��
         * boolean answer = true;
	
	      int sum = 0;
	      int a = x;
	
	      while (a != 0) {
	         sum += a % 10;
	         a /= 10;
	      }
	      if (x % sum == 0)
	         answer = true;
	      else
	         answer = false;
	
	      return answer;
         */
	}
	
	

}
