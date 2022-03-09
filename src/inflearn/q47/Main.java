package inflearn.q47;

import java.util.Scanner;

/** 삽입 정렬
 * 다시 풀어보기 해설이 더 나을거같네
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int arrayLength = sc.nextInt();
		int[] intArray = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			intArray[i] = sc.nextInt();
		}

		for (int i : main.insertSort(intArray)) {
			System.out.print(i + " ");
		}
	}

	private int[] insertSort(int[] intArray) {
		for (int i = 1; i < intArray.length; i++) {
			int indexValue = intArray[i];
			int switchIndex = i;
			for (int j = i-1; j >= 0; j--) {
				if (indexValue < intArray[j]) {
					intArray[j + 1] = intArray[j];
					switchIndex = j;
				}
			}
			intArray[switchIndex] = indexValue;
		}

		return intArray;
	}
}