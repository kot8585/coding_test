package inflearn.q35;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cardCount = sc.nextInt();
		int order = sc.nextInt();
		int[] cardArray = new int[cardCount];
		for (int i = 0; i < cardCount; i++) {
			cardArray[i] = sc.nextInt();
		}
		System.out.println(main.findOrder(cardCount, cardArray, order));

	}

	private int findOrder(int cardCount, int[] cardArray, int order) {
		TreeSet<Integer> integerTreeSet = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i < cardCount; i++) {
			for (int j = i+1; j < cardCount; j++) {
				for (int k = j+1; k < cardCount; k++) {
					integerTreeSet.add(cardArray[i] + cardArray[j] + cardArray[k]);
				}
			}
		}

		int cnt = 0;
		for (Integer cardsSum : integerTreeSet) {
			cnt++;
			if (cnt == order) {
				return cardsSum;
			}
		}
		return -1;
	}
}
