package inflearn.q14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int person = sc.nextInt();
		int[] height = new int[person];
		for (int i = 0; i < person; i++) {
			height[i] = sc.nextInt();
		}

		System.out.println(main.solution(person, height));

	}

	private int solution(int person, int[] height) {
		int cnt = 1;
		int biggerHeight = height[0];
		for (int i = 1; i < person; i++) {
			if (biggerHeight < height[i]) {
				cnt++;
				biggerHeight = height[i];
			}
		}
		return cnt;
	}
}
