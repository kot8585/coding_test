package inflearn.q34;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] firstString = scanner.next().toCharArray();
		char[] secondString = scanner.next().toCharArray();
		Main main = new Main();
		System.out.println(main.countAna(firstString, secondString));
	}

	private int countAna(char[] firstString, char[] secondString) {
		int count = 0;
		int windowSize = 0;

		Map<Character, Integer> secondElementCnt = new HashMap<>();
		for (int i = 0; i < secondString.length; i++) {
			Integer charCnt = secondElementCnt.getOrDefault(secondString[i], 0);
			secondElementCnt.put(secondString[i], ++charCnt);
		}

		Map<Character, Integer> countChar = new HashMap<>();
		for (int i = 0; i < firstString.length; i++) {
			if (windowSize >= secondString.length && countChar.get(firstString[i - windowSize])!=null) {
				Integer integer = countChar.get(firstString[i - windowSize]);
				if (integer > 1) {
					countChar.put(firstString[i - windowSize], integer-1);
				} else if (integer == 1) {
					countChar.remove(firstString[i - windowSize]);
				}
				windowSize--;
			}


			countChar.put(firstString[i], countChar.getOrDefault(firstString[i], 0) + 1);
			windowSize++;
			if(secondElementCnt.equals(countChar)) count++;
//			boolean result = true;
//			if (secondElementCnt.size() == countChar.size()) {
//				for (Character character : secondElementCnt.keySet()) {
//					boolean equals = secondElementCnt.get(character).equals(countChar.get(character));
//					if (!equals) {
//						result = false;
//						break;
//					}
//				}
//			}
//
//			if(result)
//				count++;

		}
		return count;
	}
}
