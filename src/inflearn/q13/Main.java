package inflearn.q13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TODO. 코드 엄청 더럽네.. 다시 짜세여
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		String inputString = sc.nextLine();
		String[] strings = inputString.split(" ");
		List<Integer> input = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) { //어차피 이렇게 for문 돌릴거면 그냥 for문 돌려서 받는게 훨 나을것 같은데..?
			input.add(Integer.parseInt(strings[i]));
		}
		main.printBigger(cnt, input).stream().forEach(i -> System.out.printf(i + " "));
	}

	private List<Integer> printBigger(int cnt, List<Integer> inputString) {
		List<Integer> result = new ArrayList<>();
		result.add(inputString.get(0));
		for (int i = 0; i < cnt -1; i++) {
			if (inputString.get(i) < inputString.get(i + 1)) {
				result.add(inputString.get(i + 1));
			}
		}
		return result;
  	}
}
