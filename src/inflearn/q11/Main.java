package inflearn.q11;

import java.util.Scanner;

//TODO
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		System.out.println(main.compachString(inputString));
	}

	private String compachString(String inputString) {
		int cnt = 1;
		char[] charArray = inputString.toCharArray();

		String result = String.valueOf(charArray[0]);

		for (int i = 1; i < inputString.length(); i++) {
			if (charArray[i - 1] == charArray[i]){
				cnt++;
				continue;
			}

			result += cnt == 1 ? "" : cnt;
			result += charArray[i];
			cnt = 1;
		}
		if (cnt != 1) {
			result += cnt;
		}
		return result;
	}

	public String solution(String inputString) {
		String answer = "";
		inputString = inputString + " "; //아 여기서 커버하는구나 맨 마지막에 같을경우
		int cnt = 1;
		for (int i = 0; i < inputString.length() - 1; i++) {
			if(inputString.charAt(i)==inputString.charAt(i+1)) cnt++;
			else {
				answer += inputString.charAt(i);
				if(cnt>1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		return answer;
	}
}
