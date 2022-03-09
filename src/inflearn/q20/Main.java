package inflearn.q20;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 등수구하기
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int inputInt = sc.nextInt();
		int[] scoreArray = new int[inputInt];
		for (int i = 0; i < inputInt; i++) {
			scoreArray[i] = sc.nextInt();
		}
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.print(main.calRank(scoreArray[i], scoreArray) + " ");
		}
	}

	private int calRank(int score, int[] scoreArray) {
		int result = 1;
		for (int i = 0; i < scoreArray.length; i++) {
			if (score < scoreArray[i]) {
				result++;
			}
		}
		return result;
	}

	ArrayList<Integer> hello = new ArrayList<Integer>();

}
