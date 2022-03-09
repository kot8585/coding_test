package inflearn.q41;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		System.out.println(main.countBar(inputString));
	}

	private int countBar(String inputString) {
		int barCount = 0;
		Stack<Character> stack = new Stack<>();
		Character beforeChar = null;

		//pop() == ) 이면 막대기의 끝
		//pop() == ( 이면 레이저
		for (Character character : inputString.toCharArray()) {
			if (character == '(') {
				stack.push(character);
			} else {
				stack.pop();
				if (beforeChar == '(') {
					barCount += stack.size(); //레이저이면}
				} else if (beforeChar == ')') {
					barCount += 1; //막대기의 끝을 못세네 생각해보자 이건
				}
			}
			beforeChar = character;
		}
		return barCount;
	}
}
