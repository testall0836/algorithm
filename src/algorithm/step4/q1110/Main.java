package algorithm.step4.q1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum = 0;
		int cnt = 0;

		String input = br.readLine();

		if (input.length() < 2) {
			input = "0" + input;
		}
		String saveFirst = input;

		while (true) {
			sum = Integer.parseInt(input.substring(0, 1)) + Integer.parseInt(input.substring(1, 2));
			String newStr = String.valueOf(sum % 10);
			input = input.substring(1) + newStr;

			cnt++;
			if (input.equalsIgnoreCase(saveFirst)) {
				bw.write(cnt + "");
				break;
			}
		}

		bw.close();
		br.close();

	}
}
