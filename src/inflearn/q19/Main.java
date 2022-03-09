package inflearn.q19;

import java.util.Scanner;

/**
 * 점수 계산
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] intArray = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			intArray[i] = sc.nextInt();
		}
		System.out.println(main.sumScore(intArray));
	}

	private int sumScore(int[] intArray) {
		int result = 0;
		int score = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 0) {
				score = 0;
				continue;
			}
			score++;
			result += score;
		}
		return result;
	}
}
