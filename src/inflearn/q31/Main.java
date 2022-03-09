package inflearn.q31;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int studentCnt = sc.nextInt();
		String choice = sc.next();

		System.out.println(main.electLeader(choice.toCharArray()));
	}

	private char electLeader(char[] choice) {
		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < choice.length; i++) {
			Integer integer = hashMap.getOrDefault(choice[i], 0);
			hashMap.put(choice[i], integer + 1);
		}

		int max = 0;
		char leader = ' ';
		for (char candidate : hashMap.keySet()) {
			if (max < hashMap.get(candidate)) {
				max = hashMap.get(candidate);
				leader = candidate;
			}
		}
		return leader;
	}
}
