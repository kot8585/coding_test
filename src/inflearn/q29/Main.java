package inflearn.q29;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println(main.solution(m));
	}

	private int solution(int m) {
		int lt = 1;
		int rt = 1;
		int sum = 0;
		int result = 0;

		for (; rt < m; rt++) {
			sum += rt;
			while  (sum >= m) {
				if(sum == m) result++;
				sum -= lt++;
			}
			if(lt > rt) break;
		}
		return result;
	}
}
