package inflearn.q21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 9. 격자판 최대합
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int inputInt = sc.nextInt();
		int[][] grating = new int[inputInt][inputInt];
		for (int i = 0; i < inputInt; i++) {
			for (int j = 0; j < inputInt; j++) {
				grating[i][j]= sc.nextInt();
			}
		}
		System.out.println(main.calculMaxSum(grating));

	}

	private int calculMaxSum(int[][] grating) {
		int max = 0;
		int diagonal = 0; //대각
		int reverseDiagonal = 0; //위에꺼 대각 반대로
		for (int i = 0; i < grating.length; i++) {
			int vertical = 0; //세로
			int width = 0; //가로

			for (int j = 0; j < grating[i].length; j++) {
				width += grating[i][j];
				vertical += grating[j][i];
			}

			diagonal += grating[i][i];
			reverseDiagonal += grating[grating.length - 1 -i][i];
			max = Math.max(max, width);
			max = Math.max(max, vertical);
		}
		max = Math.max(max, diagonal);
		max = Math.max(max, reverseDiagonal);
		return max;
	}

	private int calculMaxSumV2(int[][] grating) {
		int diagonal = 0; //대각
		int reverseDiagonal = 0; //위에꺼 대각 반대로
		ArrayList<Integer> integers = new ArrayList<>();
		for (int i = 0; i < grating.length; i++) {
			int vertical = 0; //세로
			int width = 0; //가로

			for (int j = 0; j < grating[i].length; j++) {
				width += grating[i][j];
				vertical += grating[j][i];
			}

			diagonal += grating[i][i];
			reverseDiagonal += grating[grating.length - 1 -i][i];
			integers.add(vertical);
			integers.add(width);
		}
		integers.add(diagonal);
		integers.add(reverseDiagonal);

		return Collections.max(integers);
	}
}
