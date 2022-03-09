package inflearn.q27;

import java.util.Scanner;

public class Main {
	//N일동안의 매출액 //K일동안의 최대 매출액
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] salesNdays = new int[n];
		for (int i = 0; i < n; i++) {
			salesNdays[i] = sc.nextInt();
		}

		System.out.println(main.getMaxSales2(salesNdays, m));
	}

	private int getMaxSales(int[] salesNdays, int m) {
		int max = 0;
		for (int i = 0; i < salesNdays.length - 2; i++) {
			int sales = 0;
			for (int j = 0; j < m; j++) {
				sales += salesNdays[i + j];
			}
			if(max < sales) max = sales;
		}
		return max;
	}

	private int getMaxSales2(int[] salesNdays, int m) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum += salesNdays[i];
		}
		max = sum;

		for (int i = m; i < salesNdays.length; i++) {
			sum += (salesNdays[i] - salesNdays[i - m]);
			max = Math.max(sum, max);
		}
		return max;
	}
}
