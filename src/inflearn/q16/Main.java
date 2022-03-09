package inflearn.q16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int inputInt = sc.nextInt();
		Arrays.stream(main.pibonacci(inputInt)).forEach((x) -> System.out.printf(x +" "));
	}

	private static int[] pibonacci(int inputInt) {
		int[] result = new int[inputInt];
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < inputInt; i++) {
			result[i] = result[i-2] + result[i-1];
		}
		return result;
	}
}
