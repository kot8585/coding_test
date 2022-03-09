package inflearn.dfs.q2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//나눈 몫이 2보다 작을때까지
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		main.binary(nextInt);
	}

	private void binary(int nextInt) {
		if (nextInt < 2) {
			System.out.print(nextInt);
			return;
		}
		binary(nextInt/2);
		System.out.print(nextInt%2);
	}
}
