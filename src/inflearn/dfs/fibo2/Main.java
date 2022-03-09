package inflearn.dfs.fibo2;

public class Main {
		static int[] fibo;
	public static void main(String[] args) {
		Main main = new Main();
		int n = 10;
		fibo = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			fibo[i] = main.DFS(i);
			System.out.println(fibo[i]);
		}

	}

	private int DFS(int i) {
		//배열에 있으면 계산 안할거야
		if(fibo[i] > 0) return fibo[i];

		if(i==1) return 1;
		else if (i==2) return 1;
		else return DFS(i-2) + DFS(i - 1);
	}
}
