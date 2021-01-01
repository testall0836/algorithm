package algorithm.step5.q2577;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int inputA = Integer.parseInt(br.readLine());
		int inputB = Integer.parseInt(br.readLine());
		int inputC = Integer.parseInt(br.readLine());

		int total = inputA * inputB * inputC;
		String totalStr = String.valueOf(total);

		char[] arr = totalStr.toCharArray();
		int[] numbers = new int[10];

		for (char ch : arr) {

			int idx = (int) ch - '0';

			numbers[idx] = numbers[idx] + 1;
		}

		for (int number : numbers) {
			bw.write(number + "\n");
		}

		bw.close();
		br.close();
	}
}
