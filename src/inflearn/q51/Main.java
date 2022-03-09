package inflearn.q51;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int pointCnt = sc.nextInt();
		List<Coordinate> list = Collections.EMPTY_LIST;
		for (int i = 0; i < pointCnt; i++) {
//			new
		}

	}

	public class Coordinate implements Comparable<Coordinate> {

		private int x;
		private int y;

		@Override
		public int compareTo(Coordinate o) {
			//양수가 나오면 자리를 바꾸고 음수가 나오면 바꾸지 않는다.
			if (this.x == o.x) {
				return this.y - o.y;
			} else {
				return this.x - o.x;
			}
		}
	}
}
