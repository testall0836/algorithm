package algorithm.step9.q2581;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �Ҽ�
 * 
 * �ð� ���� - 1 �� 
 * �޸� ���� - 128 MB
 * 
 * �ҿ� �ð� - 128 ms 
 * �ҿ� �޸� - 12056 KB
 * 
 * @author testall0836
 * @date 2021. 1. 23
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 1<= M <= N <= 10000
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int decimalSum = 0;
		int minDecimal = 0;

		for (int i = M; i <= N; i++) {
			int vs = 2;
			int check = 0;

			if (i == 1) { // �Ҽ� �ƴ�
				continue;
			} else {
				while (true) {

					if (i == vs && check == 0) { // 2 �̻��� ���ڿ��� ��������?
						decimalSum += i;
						if (minDecimal == 0) { // �ڿ��� �ƴ� 0�� ���Ͽ� ���� ���� ���� �Ҽ� ����
							minDecimal = i;
						}
						break;
					} else if (i != vs && check > 0) {
						break;
					}

					if (i % vs == 0) {
						check++;
					}
					vs++;
				}
			}
		}

		if (minDecimal == 0) {
			bw.write(String.valueOf(-1));
		} else {
			bw.write(String.valueOf(decimalSum) + "\n" + String.valueOf(minDecimal));
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
