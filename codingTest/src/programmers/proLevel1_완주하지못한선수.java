package programmers;

import java.util.Arrays;

public class proLevel1_�����������Ѽ��� {
	//���α׷��ӽ� LV1 �������� ���� ����

	public static void main(String[] args) {
		//String [] participant = {"leo", "kiki", "eden"}; //���� ����
		//String [] completion = {"eden", "kiki"}; //���� ����
		
		String [] participant = {"marina", "josipa", "nikola", "vinko", "filipa"}; //���� ����
		String [] completion = {"josipa", "filipa", "marina", "nikola"}; //���� ����
		
		//String [] participant = {"mislav", "stanko", "mislav", "ana"}; //���� ����
		//String [] completion = {"stanko", "ana", "mislav"}; //���� ����
		
		System.out.println(solution(participant, completion));
	} //main
	
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer =  participant[i];
				return answer;
			} //if
		} //for
		
		answer = participant[participant.length - 1];
		return answer;
    } //solution
	
	
	
	/* ����,,,
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		for(int i = 0; i < participant.length; i++) {
			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) {
					participant[i] = "";
					completion[j] = "";
				} 
			} //for j
			
			if (participant[i] != "") {
				answer = participant[i];
				break;
			}
		} //for i
		
        return answer;
    } //solution
    */
	
} //class
