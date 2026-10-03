package queue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingLetter {
	public static String firstNonRepeating(String stream) {
		if (stream == null) {
			throw new NullPointerException("Stream must not be null");
		}

		Map<Character, Integer> frequencies = new HashMap<>();
		Queue<Character> candidates = new ArrayDeque<>();
		StringBuilder result = new StringBuilder(stream.length());

		for (int i = 0; i < stream.length(); i++) {
			char current = stream.charAt(i);
			frequencies.put(current, frequencies.getOrDefault(current, 0) + 1);
			candidates.add(current);

			while (!candidates.isEmpty() && frequencies.get(candidates.peek()) > 1) {
				candidates.remove();
			}
			result.append(candidates.isEmpty() ? '#' : candidates.peek());
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String stream = "aabccxb";
		System.out.println("Stream = " + stream);
		System.out.println("First non-repeating after each character = " + firstNonRepeating(stream));
	}
}
