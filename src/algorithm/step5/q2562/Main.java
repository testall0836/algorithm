package algorithm.step5.q2562;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int idx = 0;
		int first = 0;
		int input = -1;


		for (int i = 1; i < 10; i++) {
			input = Integer.parseInt(br.readLine());

			if (input > first) {
				first = input;
				idx = i;
			}
		}
		bw.write(first + "\n" + idx);
		bw.close();
		br.close();
	}
}