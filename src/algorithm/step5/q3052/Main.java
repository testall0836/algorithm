package algorithm.step5.q3052;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = -1;
		int[] inputs = new int[10];
		int cnt = 0;

		for (int i = 0; i < 10; i++) {
			input = Integer.parseInt(br.readLine()) % 42;

			for (int j = 0; j <= cnt; j++) {
				if (cnt == j) {
					inputs[cnt] = input;
					cnt++;
					break;
				}
				if (inputs[j] == input) {
					break;
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.close();
		br.close();
	}
}