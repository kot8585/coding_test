package inflearn.dfs.DFS2;

public class Main {
	static int n;
	static int[] ch;

	public static void main(String[] args) {
		Main main = new Main();
		n = 3;
		ch = new int[n+1];
		main.DFS(1);
	}

	private void DFS(int L) {
		if (L > n) {
			for (int i = 1; i <= n; i++) {
				if (ch[i] == 1) {
					System.out.print(i + " ");
				}
			}
		} else {
			ch[L] = 1;
			DFS(L + 1);
			ch[L] = 0;
			DFS(L + 1);
		}
	}
}
