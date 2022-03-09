package inflearn.q48;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int cacheSize = sc.nextInt();

		int workSize = sc.nextInt();
		int[] workArray = new int[workSize];
		for (int i = 0; i < workSize; i++) {
			workArray[i] = sc.nextInt();
		}

		int[] cacheData = main.getCacheData(cacheSize, workArray);
		for (int cacheDatum : cacheData) {
			System.out.print(cacheDatum + " ");
		}
	}

	private int[] getCacheData(int cacheSize, int[] workArray) {
		int[] cacheData = new int[cacheSize];
		int cacheDataSize = 0; //얘랑 switch하려고
		//배열에 데이터가 없을경우 arr[size]에 insert
		//데이터가 있을경우 arr[0] 이랑 switch
		for (int workData : workArray) {
			//일단 같은게 없을때

			int tmp = cacheDataSize - 1;
			for (int i = 0; i < cacheDataSize; i++) {
				if (cacheData[i] == workData) {
					tmp = i;
					cacheDataSize--;
				}
			}
			for (int i = tmp-1; i >= 0 && i < cacheData.length-1; i--) {
				cacheData[i+1] = cacheData[i];
			}
			cacheData[0] = workData;
			cacheDataSize++;

		}
		return cacheData;
	}
}
