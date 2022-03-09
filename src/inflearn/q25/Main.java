package inflearn.q25;


import java.util.Scanner;

public class Main {
	//1. N = 첫번째 배열 크기
	//2. N의 원소
	//3. M = 두번째 배열 크기
	//4. M의 원소
	//두 배열을 합쳐 오름차순으로 정렬
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int[] firstArray = new int[first];
		for (int i = 0; i < first; i++) {
			firstArray[i] = sc.nextInt();
		}
		int second = sc.nextInt();
		int[] secondArray = new int[second + first];
		for (int i = 0; i < second; i++) {
			secondArray[i] = sc.nextInt();
		}

		//1. 두 배열 합치기
		//2. 버블정렬 할까
		for (int i = second; i < secondArray.length; i++) {
			secondArray[i] = firstArray[i - second];
		}

		main.solution1(secondArray);

	}
 	//n^2
	private void solution1(int[] secondArray) {
		for (int i = 1; i < secondArray.length; i++) {
			for (int j = 0; j < secondArray.length - i; j++) {
				if (secondArray[j] > secondArray[j + 1]) {
					int tmp = secondArray[j + 1];
					secondArray[j + 1] = secondArray[j];
					secondArray[j] = tmp;
				}
			}

		}
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}
	}


}
