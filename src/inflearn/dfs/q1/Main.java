package inflearn.dfs.q1;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		main.dfs(3);
	}

	private void dfs(int i) {
		if (i <= 0) {
			return;
		} else {
			dfs(i-1);
			System.out.println(i + " ");
		}
	}
}
