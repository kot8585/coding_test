package inflearn.dfs.BFS2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//송아지 찾기
public class Main {
	public static void main(String[] args) {
		Main tree = new Main();
		Scanner sc = new Scanner(System.in);
		int man = sc.nextInt();
		int horse = sc.nextInt();
		System.out.println(tree.DFS(man, horse));
	}

	private int DFS(int man, int horse) {

		Queue<Integer> queue = new LinkedList<>();
		queue.add(man);
		//TODO 배열에 담아보장 이렇게 하면 전꺼의 데이터도 담기는구나... 진짜 전체데이터를 담아야겠네
		int level = 0;
		int size;
		int move[] = {-1, 1, 5};

		while (!queue.isEmpty()) {
			size = queue.size();

			for (int i = 0; i < size; i++) {
				Integer node = queue.poll();
				if (node.equals(horse)) {
					return level;
				}
				//queue에 같은 데이터 있는지 확인하고 넣어야될거같은데
				for (int j = 0; j < move.length; j++) {
					int nodeData  = node + move[j];
					if (!queue.contains(nodeData)) {
						queue.add(nodeData);
					}
				}
			}
			level++;
		}
		return -1;
	}
}
