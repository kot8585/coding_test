package inflearn.q7;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Main2 main = new Main2();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		System.out.println(main.isPalindrome(inputString));
	}

	public String isPalindrome(String inputString) {
		StringBuilder builder = new StringBuilder(inputString);
		String reverseString = builder.reverse().toString();
		boolean equals = reverseString.equalsIgnoreCase(inputString);
		if (equals) {
			return "YES";
		}
		return "NO";
	}
}
