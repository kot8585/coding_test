package inflearn.q26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 공통 원소 구하기
 * 틀렸지롱
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
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

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		main.sameEleSort2(firstArray, secondArray).stream().forEach((i) -> System.out.print(i + " "));;
	}

	private List<Integer> sameEleSort(int[] firstArray, int[] secondArray) {
		int first = firstArray.length;
		int second = secondArray.length;

		int p1 = 0;
		int p2 = 0;

		List<Integer> sumArray = new ArrayList<>();
		while (p1 < first && p2 < second) {
			if(firstArray[p1] < secondArray[p2]) sumArray.add(firstArray[p1++]);
			else sumArray.add(secondArray[p2++]);
		}

		if(p1 < first) sumArray.add(firstArray[p1]);
		if(p2 < second) sumArray.add(secondArray[p2]);

		ArrayList<Integer> resultSort = new ArrayList<>();
		for (int i = 1; i < sumArray.size(); i++) {
			if (sumArray.get(i-1).equals(sumArray.get(i)) ) {
				resultSort.add(sumArray.get(i));
			}
		}
		return resultSort;
	}

	public List<Integer> sameEleSort2(int[] firstArray, int[] secondArray) {
		int first = firstArray.length;
		int second = secondArray.length;

		int p1 = 0;
		int p2 = 0;

		ArrayList<Integer> resultSort = new ArrayList<>();
		while (p1 < first && p2 < second) {
			if(firstArray[p1] < secondArray[p2]) p1++;
			else if(firstArray[p1] > secondArray[p2]) p2++;
			else if(firstArray[p1] == secondArray[p2]) {
				resultSort.add(firstArray[p1++]);
				p2++;
			}
		}
		return resultSort;
	}
}
