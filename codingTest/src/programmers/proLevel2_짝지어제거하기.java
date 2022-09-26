package programmers;

import java.util.Stack;

public class proLevel2_짝지어제거하기 {

	public static void main(String[] args) {
		String s = "cdcd";
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s){
        Stack<Character> stack = new Stack<>();
		
        for (char c : s.toCharArray()) {
			if (stack.isEmpty() || stack.peek() != c) {
				stack.push(c);
			} else {
				stack.pop();
			}
		}
		
        return stack.size() > 0 ? 0 : 1;
    }

}
