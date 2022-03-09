package inflearn.q22;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int inputInt = sc.nextInt() + 2;

		int[][] ints = new int[inputInt][inputInt];

		for (int i = 1; i < inputInt-1; i++) {
			for (int j = 1; j < inputInt-1; j++) {
				ints[i][j] = sc.nextInt();
			}
		}

		System.out.println(main.count(ints, inputInt));
	}

	private int count(int[][] ints, int inputInt) {
		int count = 0;
		for (int i = 1; i < inputInt-1; i++) {
			for (int j = 1; j < inputInt-1; j++) {
				int number = ints[i][j];
				if(ints[i-1][j] >= number) continue;
				if(ints[i+1][j] >= number) continue;
				if(ints[i][j-1] >= number) continue;
				if(ints[i][j+1] >= number) continue;
				count++;
			}
		}
		return count;
	}
}
