package programmers;

import java.util.Stack;

public class proLevel2_괄호회전하기 {

	public static void main(String[] args) {
		String s = "[](){}";
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		int answer = 0;
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		for (int i = 0; i < s.length(); i++) {
			// 올바른 괄호 문자열인지 확인
			Stack<Character> stack = new Stack<>();
			
			for (int j = 0; j < sb.length(); j++) {
				if (stack.isEmpty()) {
					stack.push(sb.charAt(j));
					
					if (sb.charAt(j) == ')' || sb.charAt(j) == ']' || sb.charAt(j) == '}') {
						break;
					}
					
					continue;
				}
				
				if ((stack.peek() == '(' && sb.charAt(j) == ')') || (stack.peek() == '[' && sb.charAt(j) == ']') || (stack.peek() == '{' && sb.charAt(j) == '}')) {
					stack.pop();
				} else {
					stack.push(sb.charAt(j));
				}
			}
			
			if (stack.isEmpty()) {
				answer++;
			}
			
			// 문자열 회전
			String str = sb.substring(0, 1);
			sb.delete(0, 1).append(str);
		}
		
        return answer;
    }

}
