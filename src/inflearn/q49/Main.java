package inflearn.q49;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int studentCnt = sc.nextInt();
		int[] score = new int[studentCnt];
		for (int i = 0; i < studentCnt; i++) {
			score[i] = sc.nextInt();
		}

		System.out.println(main.isDuplicate(score));
	}

	private String isDuplicate(int[] score) {
		String answer = "U";
		Arrays.sort(score);
		for (int i = 0; i < score.length - 1; i++) {
			if (score[i] == score[i + 1]) {
				answer = "D";
				break;
			}
		}
		return answer;
	}

}

