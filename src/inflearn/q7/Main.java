package inflearn.q7;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		System.out.println(main.isPalindrome(inputString.toLowerCase()));
	}

	private String isPalindrome(String inputString) {
		for (int i = 0; i < (inputString.length()) / 2; i++) {
			int lt = i;
			int rt = inputString.length() -i -1;
			if (inputString.charAt(lt) != inputString.charAt(rt)) {
				return "NO";
			}
			lt++;
			rt--;
		}
		return "YES";
	}
}
