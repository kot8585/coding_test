package inflearn.q36;

import java.util.Scanner;
import java.util.Stack;

/**
 * 올바른 괄호
 */
public class Main {
	public static void main(String[] args) {
		// (()(()))(()
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		char[] charArray = next.toCharArray();
		System.out.println(main.isCorrectByStack(charArray));
	}

	private String isCorrect(char[] charArray) {
		int cnt = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(') {
				cnt++;
			} else {
				cnt--;
			}
		}
		if (cnt == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}

	private String isCorrectByStack(char[] charArray) {
		Stack<Character> stack = new Stack<>();

		for (char c : charArray) {
			if (c == '(') {
				stack.push(c);
			} else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(stack.isEmpty()) return "YES";
		return "NO";
	}
}
