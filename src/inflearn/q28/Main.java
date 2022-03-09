package inflearn.q28;

import java.util.Scanner;

/**
 * 연속 부분 수열
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] intArray = new int[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = sc.nextInt();
		}

		System.out.println(main.solution(intArray, m));
	}

	private int solution(int[] intArray, int m) {
		int sum = 0;
		int lt = 0;
		int rt = 0;
		int result = 0;
		for (; rt < intArray.length; rt++) {
			sum += intArray[rt];
			while (sum >= m) {
				if (sum == m) result++;
				sum -= intArray[lt++];
				}
			}
		return result;
	}
}
