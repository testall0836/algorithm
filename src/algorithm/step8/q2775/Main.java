package algorithm.step8.q2775;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int cnt = Integer.parseInt(br.readLine()); // 케이스 케이스 갯수
			for (int i = 0; i < cnt; i++) {
				int k = Integer.parseInt(br.readLine()); // k층
				int n = Integer.parseInt(br.readLine()); // n호

				int[][] arr = new int[k + 1][n + 1];

				for (int j = 0; j < n; j++) {
					arr[0][j] = j + 1;
				}
				for (int j = 0; j <= k; j++) {
					arr[j][0] = 1;
				}

				for (int z = 1; z <= k; z++) {
					for (int v = 1; v < n; v++) {
						arr[z][v] = arr[z][v - 1] + arr[z - 1][v];
					}
				}
				bw.write(String.valueOf(arr[k][n - 1]) + "\n");
			}

			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
