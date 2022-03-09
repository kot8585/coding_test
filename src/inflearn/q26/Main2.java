package inflearn.q26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Main2 main = new Main2();
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		List<Integer> firstList = new ArrayList<>();
		for (int i = 0; i < first; i++) {
			firstList.add(sc.nextInt());
		}

		int second = sc.nextInt();
		List<Integer> secondList = new ArrayList<>();
		for (int i = 0; i < second; i++) {
			secondList.add(sc.nextInt());
		}

	}

}
