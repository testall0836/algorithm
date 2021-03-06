package algorithm.step6.q4673;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int operNum = 1;
		int initNum = 1;
		int[] selfNum = new int[10040];

		while (true) {

			int totalNum = operNum;

			totalNum = totalNum + operNum / 1000;
			operNum = operNum % 1000;

			totalNum = totalNum + operNum / 100;
			operNum = operNum % 100;

			totalNum = totalNum + operNum / 10;
			operNum = operNum % 10;

			totalNum = totalNum + operNum;
			operNum = totalNum + operNum;

			if (initNum > 10000) {
				break;
			} else {
				initNum = initNum + 1;
				operNum = initNum;
				selfNum[totalNum] = 1;
			}

		}

		for (int i = 1; i < 10000; i++) {
			if (selfNum[i] == 0) {
				bw.write(i + "\n");
			}
		}

		bw.close();
	}
}
