package programmers;

import java.util.Stack;

public class proLevel2_��ȣȸ���ϱ� {

	public static void main(String[] args) {
		String s = "[](){}";
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		int answer = 0;
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		for (int i = 0; i < s.length(); i++) {
			// �ùٸ� ��ȣ ���ڿ����� Ȯ��
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
			
			// ���ڿ� ȸ��
			String str = sb.substring(0, 1);
			sb.delete(0, 1).append(str);
		}
		
        return answer;
    }

}
