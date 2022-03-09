package inflearn.q25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 투 포인트
 */
public class Main2 {
	public static void main(String[] args) {
		Main2 main = new Main2();
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int[] firstArray = new int[first];
		for (int i = 0; i < first; i++) {
			firstArray[i] = sc.nextInt();
		}
		int second = sc.nextInt();
		int[] secondArray = new int[second];
		for (int i = 0; i < second; i++) {
			secondArray[i] = sc.nextInt();
		}
		main.twoPoint(firstArray, secondArray).stream().forEach((i) -> System.out.print(i + " "));

	}

	public List<Integer> twoPoint(int[] firstArray, int[] secondArray) {
		int first = firstArray.length;
		int second = secondArray.length;

		int p1 = 0;
		int p2 = 0;
		ArrayList<Integer> sumArray = new ArrayList<>();
		while (p1 < first && p2 < second) {
			if (firstArray[p1] < secondArray[p2]) {
				sumArray.add(firstArray[p1]);
				p1++;
			} else {
				sumArray.add(secondArray[p2]);
				p2++;
			}
		}

		//어떤 배열이 끝에 다다르면 남은 애들 넣어주기
		if (p1 < first) {
			for (int i = p1; i < first; i++) {
				sumArray.add(firstArray[i]);
			}
		}
		if (p2 < second) {
			for (int i = p2; i < second; i++) {
				sumArray.add(secondArray[i]);
			}
		}
		return sumArray;
	}
}
