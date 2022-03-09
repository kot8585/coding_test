package inflearn.q32;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 아나그램
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		char[] firstCharArray = first.toCharArray();
		String second = sc.next();
		char[] secondCharArray = second.toCharArray();
		System.out.println(main.solution(firstCharArray, secondCharArray));
	}

	private String solution(char[] firstCharArray, char[] secondCharArray) {
		Map<Character, Integer> firstMap = new HashMap<>();
		for (char key : firstCharArray) {
			firstMap.put(key, firstMap.getOrDefault(key, 0) + 1);
		}

		Map<Character, Integer> secondMap = new HashMap<>();
		for (char key : secondCharArray) {
			secondMap.put(key, secondMap.getOrDefault(key, 0) + 1);
		}

		for (Character firstKey : firstMap.keySet()) {
			if (!secondMap.containsKey(firstKey)) return "NO";
			if(!firstMap.get(firstKey).equals(secondMap.get(firstKey))) return "NO";
		}
		return "YES";
	}

	private String solution2(char[] firstCharArray, char[] secondCharArray) {
		Map<Character, Integer> firstMap = new HashMap<>();
		for (char key : firstCharArray) {
			firstMap.put(key, firstMap.getOrDefault(key, 0) + 1);
		}

		for (char key : secondCharArray) {
			if (!firstMap.containsKey(key) || firstMap.get(key)==0) return "NO";
			firstMap.put(key, firstMap.get(key)-1);
		}

		//NOTE. 이거 할 필요 없다... 왜냐면 길이가 같으면 어차피 무조건 한개는 -1이 되니까
		for (Integer value : firstMap.values()) {
			if(!value.equals(0)) return "NO";
		}
		return "YES";

	}

}
