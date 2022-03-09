package inflearn.q43;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		Scanner sc = new Scanner(System.in);
		String necessaryCourse = sc.next();
		String choiceCourse = sc.next();
		System.out.println(main.isCorrectCourse(necessaryCourse, choiceCourse));
	}

	private String isCorrectCourse(String necessaryCourse, String choiceCourse) {
		String isCorrectCourse = "NO";
		Queue<Character> subjectQueue = new LinkedList<>();
		for (char necessarySubject : necessaryCourse.toCharArray()) {
			subjectQueue.offer(necessarySubject);
		}

		for (char choiceSubject : choiceCourse.toCharArray()) {
			if(!subjectQueue.contains(choiceSubject)) continue;

			//포함한다면
			if (!Objects.equals(subjectQueue.poll(), choiceSubject)) {
				return "NO";
			} else {
				if(subjectQueue.isEmpty()) return "YES";
 			}
		}
		return "NO";
	}
}
