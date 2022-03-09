package inflearn.q18;

import java.util.Scanner;

/**
 * 6. 뒤집은 소수
 */
//TODO 하..
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner scanner = new Scanner(System.in);
		int inputInt = scanner.nextInt();
		int[] intArray = new int[inputInt];
		for (int i = 0; i < inputInt; i++) {
			intArray[i] = scanner.nextInt();
		}

		int[] reverseArray = main.reverse(intArray, inputInt);
		for (int i = 0; i < reverseArray.length; i++) {
			if(main.isPrime(reverseArray[i]))
				System.out.print(reverseArray[i] + " ");
		}
	}

	private boolean isPrime(int reverseArray) {
			if(reverseArray == 1) return false;
			for (int j = 2; j < reverseArray; j++) {
				if (reverseArray % j == 0) {
					return false;
				}
			}
		return true;
		}

	private int[] reverse(int[] intArray, int inputInt) {
		int[] reverseArray = new int[inputInt];
		for (int i = 0; i < inputInt; i++) {
			int x = intArray[i];
			int tmp = 0;
			while (x > 0) {
				int remainder = x % 10;
				x = x / 10;
				tmp = tmp * 10 + remainder;
			}
			reverseArray[i] = tmp;
		}
		return reverseArray;
	}
}
