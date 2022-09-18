package programmers;

import java.util.Arrays;

public class proLevel1_완주하지못한선수 {
	//프로그래머스 LV1 완주하지 못한 선수

	public static void main(String[] args) {
		//String [] participant = {"leo", "kiki", "eden"}; //참여 선수
		//String [] completion = {"eden", "kiki"}; //완주 선수
		
		String [] participant = {"marina", "josipa", "nikola", "vinko", "filipa"}; //참여 선수
		String [] completion = {"josipa", "filipa", "marina", "nikola"}; //완주 선수
		
		//String [] participant = {"mislav", "stanko", "mislav", "ana"}; //참여 선수
		//String [] completion = {"stanko", "ana", "mislav"}; //완주 선수
		
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
	
	
	
	/* 실패,,,
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
