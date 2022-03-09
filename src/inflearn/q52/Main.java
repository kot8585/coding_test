package inflearn.q52;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		int toFindNumber = sc.nextInt();

		int[] ints = new int[length];

		for (int i = 0; i < length; i++) {
			ints[i] = sc.nextInt();
		}

		System.out.println(main.findNumber(ints, toFindNumber));
	}

	private int findNumber(int[] ints, int toFindNumber) {
		int answer = 0;
		Arrays.sort(ints);
		int lt = 0;
		int rt = ints.length - 1;

		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (ints[mid] == toFindNumber) {
				answer = mid + 1;
				break;
			}
			if (ints[mid] > toFindNumber) {
				rt = mid - 1;
			} else lt = mid + 1;

		}
		return answer;
	}
}

