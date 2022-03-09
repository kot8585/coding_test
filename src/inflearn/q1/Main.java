package inflearn.q1;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public int solution(String inputString, Character inputChar){
		int length = inputString.length();
		int charSameStringCount = 0;
		for (int i = 0; i < length; i++) {
			if (!inputChar.equals(inputString.charAt(i))) {
				continue;
			}
			charSameStringCount++;
		}
		return charSameStringCount;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next().toLowerCase(Locale.ROOT);
		Character inputChar = sc.next().toLowerCase(Locale.ROOT).charAt(0);

		System.out.println(main.solution(inputString, inputChar));

	}

}

