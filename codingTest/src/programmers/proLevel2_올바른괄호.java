package programmers;

import java.util.Stack;

public class proLevel2_¿Ã¹Ù¸¥°ýÈ£ {

	public static void main(String[] args) {
		String s = ")()(";
		
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
		Stack<Boolean> stack = new Stack<>();
		boolean[] brackets = new boolean[s.length()]; // ( true / ) false
		
		for (int i = 0; i < brackets.length; i++) {
			if (s.charAt(i) == '(') {
				brackets[i] = true;
			} else {
				brackets[i] = false;
			}
		}
		
		for (int i = 0; i < brackets.length; i++) {
			if (stack.empty()) {
				stack.push(brackets[i]);
				continue;
			}
			
			if (stack.peek() && !brackets[i]) { 
				stack.pop();
			} else {
				stack.push(brackets[i]);
			}
		}
		
        return stack.empty() ? true : false;
    }

}
