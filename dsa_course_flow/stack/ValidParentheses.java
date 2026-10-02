package stack;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String expression) {
		Stack<Character> openingBrackets = new Stack<>();

		for (int index = 0; index < expression.length(); index++) {
			char current = expression.charAt(index);
			if (current == '(' || current == '[' || current == '{') {
				openingBrackets.push(current);
			} else if (current == ')' || current == ']' || current == '}') {
				if (openingBrackets.isEmpty() || !matches(openingBrackets.pop(), current)) {
					return false;
				}
			}
		}

		return openingBrackets.isEmpty();
	}

	private static boolean matches(char opening, char closing) {
		return (opening == '(' && closing == ')')
				|| (opening == '[' && closing == ']')
				|| (opening == '{' && closing == '}');
	}

	public static void main(String[] args) {
		String expression = "{[()]}";
		System.out.println("Parentheses valid = " + isValid(expression));
	}
}
