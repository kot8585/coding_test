package inflearn.q42;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 공주구하기
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		Scanner sc = new Scanner(System.in);
		int princes = sc.nextInt();
		int removeNumber = sc.nextInt();
		System.out.println(main.selectPrince(princes, removeNumber));
	}

	private int selectPrince(int princes, int removeNumber) {
		int prince = 0;
		Queue<Integer> priceQueue = new LinkedList<>();

		//왕자들 queue로 세우기
		for (int i = 1; i <= princes; i++) {
			priceQueue.offer(i);
		}

		while (!priceQueue.isEmpty()) {
			for (int i = 0; i < removeNumber; i++) {
				if (i == removeNumber-1) {
					prince = priceQueue.poll();
					continue;
				}
				priceQueue.offer(priceQueue.poll());
			}
		}
		return prince;
	}
}
