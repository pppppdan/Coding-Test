package programmers;

public class proLevel1_�����ѱݾװ���ϱ� {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		solution(price, money, count);
	}
	
	public static long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for (int i = 1; i <= count; i++) {
			sum += price * i; 
		}
        
        answer = sum - money;
        
        //�ݾ��� �������� ���� ��� 0 ����
        if (answer <= 0) {
			answer = 0;
		}
        
        return answer;
    }

}
