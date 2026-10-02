package stack;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static String reverse(String value) {
		Stack<Character> characters = new Stack<>();
		for (int index = 0; index < value.length(); index++) {
			characters.push(value.charAt(index));
		}

		StringBuilder reversed = new StringBuilder(value.length());
		while (!characters.isEmpty()) {
			reversed.append(characters.pop());
		}
		return reversed.toString();
	}

	public static void main(String[] args) {
		String value = "Sigma Prime";
		System.out.println("Original: " + value);
		System.out.println("Reversed: " + reverse(value));
	}
}
