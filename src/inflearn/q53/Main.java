package inflearn.q53;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//문제의 답이 lt,rt 사이에 있다고 생각됄때만 결정알고리즘을 사용할 것
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int musicCount = sc.nextInt();
		int dvdCount = sc.nextInt();
		int[] musics = new int[musicCount];

		for (int i = 0; i < musicCount; i++) {
			musics[i] = sc.nextInt();
		}

		System.out.println(main.getMinSize(dvdCount, musics));
	}

	private int getMinSize(int dvdCount, int[] musics) {
		//최소 최대 구하기
		int answer = 0;
		int lt = Arrays.stream(musics).max().getAsInt();
		int rt = Arrays.stream(musics).sum();

		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (count(musics, mid) <= dvdCount) {
				answer = mid;
				rt = mid - 1;
			} else {
				lt = mid+1;
			}
		}
		return answer;
	}

	private int count(int[] musics, int capacity) {
		int cnt = 1;
		int sum = 0;
		for (int music : musics) {
			if (sum + music <= capacity) {
				sum += music;
			} else {
				sum = music;
				cnt++;
			}
		}
		return cnt;
	}

}


