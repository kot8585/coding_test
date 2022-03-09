package inflearn.q33;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int daySection = sc.nextInt();
		int[] sales = new int[days];
		for (int i = 0; i < days; i++) {
			sales[i] = sc.nextInt();
		}
		main.salesKinds(daySection, sales);
	}

	private void salesKinds(int daySection, int[] sales) {
		Map<Integer, Integer> map = new HashMap<>();

		int lt = 0;
		int rt = 0;
		for (; rt < sales.length; rt++) {
			if (rt - lt  >= daySection) {
				Integer integer = map.get(sales[lt]);
				if(integer.equals(1)) map.remove(sales[lt]);
				else map.put(sales[lt], integer - 1);
				lt++;
			}
			map.put(sales[rt], map.getOrDefault(sales[rt], 0) + 1);
			if(rt - lt + 1 == daySection) System.out.print(map.size()+" ");
		}
	}
}
