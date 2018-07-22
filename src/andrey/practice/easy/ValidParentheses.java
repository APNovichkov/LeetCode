package andrey.practice.easy;

import java.util.*;

public class ValidParentheses {

	public static void main(String[] args) {
		if(isValid("((")) {
			System.out.println("Input string has valid parentheses");
		}else {
			System.out.println("Input string is in ERROR");
		}

	}

	
	public static boolean isValid(String s) {
		boolean isValidPees = true;
		
		if(s.contentEquals("")) return true;
		Stack<Character> pStack = new Stack<Character>();
		char[] pees = s.toCharArray();
		if(pees[0] == ')' || pees[0] == '}' || pees[0] == ']' || pees.length%2 != 0) return false;
		
		for(int i = 0; i < pees.length; i++) {
			if(pees[i] == '(' || pees[i] == '{' || pees[i] == '[') {
				isValidPees = false;
				pStack.push(pees[i]);
			}else if( (pees[i] == ')' && pStack.peek() == '(') || (pees[i] == '}' && pStack.peek() == '{') 
					|| (pees[i] == ']' && pStack.peek() == '[') ){
				pStack.pop();
				isValidPees = true;
			}else {
				return false;
			}
		}
		
		System.out.println("Stack: " + pStack);
		return isValidPees;
    }
}
