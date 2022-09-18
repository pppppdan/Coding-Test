package programmers;

public class proLevel1_부족한금액계산하기 {

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
        
        //금액이 부족하지 않은 경우 0 리턴
        if (answer <= 0) {
			answer = 0;
		}
        
        return answer;
    }

}
