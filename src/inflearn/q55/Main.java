package inflearn.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//송아지 찾기 절대값 구하는게 오래걸리나보지?!?!!
public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for (int i = 0; i < 2; i++) {

		}
		int man = Integer.parseInt(br.readLine());
		int goat = Integer.parseInt(br.readLine());

		System.out.println(main.moveCount(man, goat));
	}

	private int moveCount(int man, int goat) {
		int move = 0;
		while (true) {
			int distance = Math.abs(goat - man);
			if (distance >= 3) {
				man += 5;
				move++;
				continue;
			} else {
				move += distance;
				break;
			}
		}
		return move;
	}
}
