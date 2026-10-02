package stack;

import java.util.Stack;

public class DuplicateParentheses {
	public static boolean hasDuplicateParentheses(String expression) {
		Stack<Character> characters = new Stack<>();

		for (int index = 0; index < expression.length(); index++) {
			char current = expression.charAt(index);
			if (current != ')') {
				characters.push(current);
				continue;
			}

			int enclosedCharacters = 0;
			while (!characters.isEmpty() && characters.peek() != '(') {
				characters.pop();
				enclosedCharacters++;
			}

			if (characters.isEmpty()) {
				return false;
			}
			characters.pop();

			if (enclosedCharacters == 0) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String expression = "((a+b))";
		System.out.println("Has duplicate parentheses = " + hasDuplicateParentheses(expression));
	}
}
