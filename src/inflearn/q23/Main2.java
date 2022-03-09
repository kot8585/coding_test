package inflearn.q23;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Main2 main = new Main2();
		Scanner sc = new Scanner(System.in);
		int studentCnt = sc.nextInt()+1;
		int grade = 5+1;
		int[][] ints = new int[studentCnt][grade];

		for (int i = 1; i < studentCnt; i++) {
			for (int j = 1; j < grade; j++) {
				ints[i][j] = sc.nextInt();
			}
		}

		System.out.println(main.delegate(ints, studentCnt, grade));
	}

	private int delegate(int[][] ints, int studentCnt, int grade) {
		int max = Integer.MIN_VALUE;
		int student = 1; //선출된 학생
		for (int i = 1; i < studentCnt; i++) {
			int cnt=0;
			for (int j = 1; j < studentCnt; j++) {
				for (int k = 1; k < grade; k++) {
					if (ints[i][k] == ints[j][k]) {
						cnt++;
						break; //j번학생꺼 넘어가기
					}
				}
			}
			if (cnt > max) {
				student = i;
				max = cnt;
			}

		}
		return student;
	}

}
