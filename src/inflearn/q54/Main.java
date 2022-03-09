package inflearn.q54;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int stallCount = sc.nextInt();
		int horseCont = sc.nextInt();
		int[] stalls = new int[stallCount];

		for (int i = 0; i < stallCount; i++) {
			stalls[i] = sc.nextInt();
		}
		Arrays.sort(stalls);

		//아아 오키오키
		//최대는 제일 큰값 - 최솟값
		// 최솟값 = 1
		System.out.println(main.getMinDistance(horseCont, stalls));
		
	}

	private int getMinDistance(int horseCont, int[] stalls) {
		int midDistance = -1;
		int lt = 1;
		int rt = stalls[stalls.length - 1];


		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (count(stalls, mid) >= horseCont) {
				midDistance = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}
		return midDistance;
	}

	private int count(int[] stalls, int capacity) {
		int horseCount = 1;

		int endpoint = stalls[0];
		for (int i = 0; i < stalls.length; i++) {
			if (stalls[i] - endpoint < capacity) {
				continue;
			} else {
				endpoint = stalls[i];
				horseCount++;
			}
		}
		return horseCount;
	}
}
