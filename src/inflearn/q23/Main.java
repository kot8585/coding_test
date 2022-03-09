package inflearn.q23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * 11. 임시반장 구하기 개어렵넹`
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int studentCnt = sc.nextInt();

		int[][] ints = new int[studentCnt][5];

		for (int i = 0; i < studentCnt; i++) {
			for (int j = 0; j < 5; j++) {
				ints[i][j] = sc.nextInt();
			}
		}

		System.out.println(main.delegate(ints, studentCnt));
	}

	private int delegate(int[][] ints, int studentCnt) {
		Map map= new HashMap<Integer, Integer>(5);
		HashSet<Integer> hashSet;
		for (int student = 0; student < studentCnt; student++) {
			hashSet = new HashSet<>();
			for (int grade = 0; grade < 5; grade++) {
				int group = ints[student][grade];
				for (int otherStudent = 0; otherStudent < studentCnt; otherStudent++) {
					if (group == ints[otherStudent][grade]) {
						hashSet.add(otherStudent);
					}
				}
			}
			int size = hashSet.size();
			map.put(student, size);
		}
		int max = 0;
		int student = 0;
		for (int i = 0; i < 5; i++) {
			Integer hello = (Integer) map.get(i);
			if (max < hello) {
				max = (int) map.get(i);
				student = i;
			}
		}
		return student + 1;
	}

}
