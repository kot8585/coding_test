package inflearn.q45;

import java.util.Scanner;

/**
 * 선택 정렬
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
		main.selectSort(intArray);
	}

	private void selectSort(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			int minIdx = i;
			for (int j = i+1; j < intArray.length ; j++) {
				//idx의 값보다 작으면 switch
				if (intArray[minIdx] > intArray[j]) {
					minIdx = j;
				}
			}
			int tmp = intArray[i];
			intArray[i] = intArray[minIdx];
			intArray[minIdx] = tmp;
		}

		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}
}
