package inflearn.q50;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int studentCnt = sc.nextInt();
		int[] students = new int[studentCnt];
		for (int i = 0; i < studentCnt; i++) {
			students[i] = sc.nextInt();
		}

		main.solution(students);
	}

	private void findWrongSort(int[] students) {
		//틀렸다ㅎㅎ

		int firstIdx = -1;
		for (int i = 0; i < students.length - 1; i++) {
			if (students[i] > students[i + 1]) {
				firstIdx = i;
				System.out.println(students[i]);
				break;
			}
		}

		for (int i = firstIdx + 1; i < students.length; i++) {
			if (students[i - 1] > students[i]) {
				System.out.println(students[i]);
			}
		}
	}

	private void solution(int[] students) {
		int[] tmpArray = students.clone();
		Arrays.sort(tmpArray);

		for (int i = 0; i < students.length; i++) {
			if (tmpArray[i] != students[i]) {
				System.out.print(i+1 + " ");
			}
		}
	}
}
