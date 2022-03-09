package inflearn.q46;

import java.util.Scanner;

/**
 * 버블 정렬
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

		main.bubbleSort(intArray);
	}

	private void bubbleSort(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length-i-1; j++) {
				//앞에꺼가 더 크면 switch
				if (intArray[j + 1] < intArray[j]) {
					int tmp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}