package inflearn.q30;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 이거 무조건 다시 풀기
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int change = sc.nextInt();
		int[] intArray = new int[length];
		for (int i = 0; i < length; i++) {
			intArray[i] = sc.nextInt();
		}

		System.out.println(main.answer(intArray, change));
	}

	private int solution(int[] intArray, int change) {

		ArrayList<Integer> intList = new ArrayList<>();

		if(intArray[0] != 0) intList.add(1);
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] == 0) intList.add(i);
		}
		intList.add(intArray.length);

		int cnt;
		int max = 0;
		int loop = (intList.size() / 2) + (intList.size() % 2);
		for (int i = 0; i < loop; i++) {
			if((i+change) >= intList.size()) break;
			cnt = intList.get(i+change) - intList.get(i);
			max = Math.max(cnt, max);
		}
		return max -1;
	}

	private int answer(int[] intArray, int change) {
		int result = 0;
		int lt = 0;
		int changeCnt = 0;

		for (int rt = 0; rt < intArray.length; rt++) {
			if(intArray[rt] == 0) changeCnt++;

			while(changeCnt > change) {
				if (intArray[lt] == 0) {
					changeCnt--;
				}
				lt++;
			}
			result = Math.max(result, rt - lt + 1);
		}
		return result;
	}
}

