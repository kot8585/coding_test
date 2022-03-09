package inflearn.q24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 12. 멘토링
 */
//존나 어렵자나ㅠㅠ
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int studentCnt = sc.nextInt() + 1; //인덱스 1부터 삽입
		int testCnt = sc.nextInt() + 1;

		//
		int[][] mentoMenti = new int[testCnt][studentCnt];

		for (int i = 1; i < testCnt; i++) {
			for (int j = 1; j < studentCnt; j++) {
				mentoMenti[i][j] = sc.nextInt();
			}
		}

		System.out.println(main.delegate(mentoMenti, studentCnt, testCnt));
	}

	private int delegate(int[][] mentoMenti, int studentCnt, int testCnt) {
		//map[student][otherStudent]
		//첫번째 테스트에서 1번학셍 인덱스 구하기
		// 1번학생 인덱스보다 작은애들 map의 value에서 빼기
		//두번째 테스트 검사 ...n
		//아 집가고 싶다아아아아아아
		Map<Integer, Set<Integer>> integerSetMap = new HashMap<>();
		for (int i = 1; i < studentCnt; i++) {
			HashSet<Integer> otherStudents = new HashSet<>();
			for (int j = 1; j < studentCnt; j++) {
				otherStudents.add(j);
			}
			integerSetMap.put(i, otherStudents);
		}

		int result = 0;
		for (int i = 1; i < studentCnt; i++) { //1번 학생

			for (int j = 1; j < testCnt; j++) { //테스트
				for (int k = 1; k < studentCnt; k++) { //등수
					int otherStudent = mentoMenti[j][k];
					if (!integerSetMap.get(i).contains(otherStudent)) {
						continue;
					}
					if(otherStudent == i) break; //자신보다 등수 낮은애들이면 안빼기
					integerSetMap.get(i).remove(mentoMenti[j][k]); //자신보다 등수가 높으면 제거
				}
			}
			integerSetMap.get(i).remove(i);
			result += integerSetMap.get(i).size();
		}
		
		return result;
	}
}
