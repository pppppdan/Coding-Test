package programmers;

public class proLevel1_�ݶ������� {

	public static void main(String[] args) {
		long num = 626331;
		
		solution(num);
	}
	
	//Ȧ���� ��� 3���ϰ� +1 �ϱ� ������ int ���� ��� �� ���� -> long���� ����
	public static int solution(long num) {
        int answer = 0;
        
        if (num == 1) {
			return answer;
		}
        
        while (num != 1) {
        	if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
        	
        	answer++;
        	
        	if (answer == 500) {
        		answer = -1;
    			break;
    		}
		}
        
        return answer;
    }

}
