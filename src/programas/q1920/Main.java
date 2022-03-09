package programas.q1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int firstArrayLength = sc.nextInt();
		int[] firstArray = new int[firstArrayLength];

		for (int i = 0; i < firstArrayLength; i++) {
			firstArray[i] = sc.nextInt();
 		}

		int secondArrayLength = sc.nextInt();
		int[] secondArray = new int[secondArrayLength];
		for (int i = 0; i < secondArrayLength; i++) {
			secondArray[i] = sc.nextInt();
		}

		main.solution(firstArray, secondArray);
	}

	private void solution(int[] firstArray, int[] secondArray) {
		Arrays.sort(firstArray);

		boolean isSame = false;
		for (int second : secondArray) {
			int lt = 0;
			int rt = firstArray.length-1;


			while (lt <= rt) {
				int mid = (lt + rt) / 2;

				if (second == firstArray[mid]) {
					isSame = true;
					break;
				} else if (second > firstArray[mid]) {
					lt = mid + 1;
				} else
					rt = mid - 1;
			}

			if (isSame) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			isSame = false;
		}
	}
}
