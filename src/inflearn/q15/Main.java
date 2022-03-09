package inflearn.q15;

import java.util.Arrays;
import java.util.Scanner;

//TODO
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] rockPaperScissors = new int[2][cnt];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < cnt; j++) {
				rockPaperScissors[i][j]= sc.nextInt();
			}
		}
		Arrays.stream(main.match(cnt, rockPaperScissors)).forEach(System.out::println);
	}

	private String[] match(int cnt, int[][]rockPaperScissors) {
		String[] result = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			if (rockPaperScissors[0][i] > rockPaperScissors[1][i]) {
				result[i] = "A";
				continue;
			} else if (rockPaperScissors[0][i] < rockPaperScissors[1][i]) {
				result[i] = "B";
			} else {
				result[i] = "D";
			}
		}
		return result;
	}
}
