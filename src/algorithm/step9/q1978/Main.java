package algorithm.step9.q1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �Ҽ� ã��
 * 
 * �ð� ���� 	- 2 �� 
 * �޸� ����	- 128 MB
 * 
 * �ҿ� �ð�	- 76 ms
 * �ҿ� �޸�	- 11580 KB
 * 
 * @author testall0836
 * @date 2021. 1. 20
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine()); // �Է� ���� ����
		String str = br.readLine(); // 1 2 3 5 91 �� �� ���ڵ� �Է�
		String[] input = str.split(" ");

		int decimalCnt = 0;

		for (int i = 0; i < input.length; i++) {
			int tc = Integer.parseInt(input[i]);
			int total = 1;
			int startVs = 1;

			if (tc == 1) {
				continue;
			} else if (tc == 2) {
				decimalCnt++;
			} else {
				while (true) {

					if (tc - 1 == startVs) {
						if (total == 2) {
							decimalCnt++;
						}
						break;
					} else if (tc % startVs == 0) {
						total++;
					}

					startVs++;
				}
			}
		}

		bw.write(String.valueOf(decimalCnt));

		bw.flush();
		bw.close();
		br.close();
	}
}