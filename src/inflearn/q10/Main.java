package inflearn.q10;

import java.util.Arrays;
import java.util.Scanner;

//TODO 어렵네
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		char target = sc.next().toCharArray()[0];
		Arrays.stream(main.findDistance(inputString, target)).forEach(result -> System.out.print(result + " "));
	}

	private int[] findDistance(String inputString, char target) {
		char[] charArray = inputString.toCharArray();

		int[] leftDistance = new int[inputString.length()];
		int[] resultArray = new int[inputString.length()];
		int left = 1000;

		//왼쪽에 있는 target으로부터의 거리
		for (int i = 0; i < inputString.length(); i++) {
			if (charArray[i] == target) {
				left = 0;
			} else {
				left++;
			}
			leftDistance[i] = left;
		}

		int right = 1000;
		for (int i = inputString.length() -1; i > -1; i--) {
			if (charArray[i] == target) {
				right = 0;
				resultArray[i] = 0;
			} else {
				right++;
				resultArray[i] = Math.min(right, leftDistance[i]); //이렇게 간단해질수 있다니???
//				if (right <= leftDistance[i]) {
//					resultArray[i] = right;
//				} else {
//					resultArray[i] = leftDistance[i];
//				}
			}

		}
		return resultArray;
	}
}