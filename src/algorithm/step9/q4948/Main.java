package algorithm.step9.q4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ����Ʈ�� ����
 * 
 * �ð� ���� - 1 �� 
 * �޸� ���� - 256 MB
 * 
 * �ҿ� �ð� - 144 ms 
 * �ҿ� �޸� - 12924 KB
 * 
 * @author testall0836
 * @date 2021. 1. 25
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int maxN = 123456 * 2;

		// �ִ� ���������� �Ҽ� ���ϱ�
		boolean[] decimal = new boolean[maxN + 1];

		// �ε��� 0, 1�� �Ҽ��� �ƴ�
		decimal[0] = true;
		decimal[1] = true;

		for (int i = 2; i <= maxN; i++) {
			// �Ҽ� ������ �� �ε����� �ǳʶٱ�
			if (decimal[i]) {
				continue;
			}

			// �Ҽ��� ������� true �� ������Ų��.
			for (int j = 2 * i; j <= maxN; j += i) {
				decimal[j] = true;
			}

		}

		while (true) {
			int input = Integer.parseInt(br.readLine());
			int cnt = 0;

			if (input == 0) {
				break;
			} else {
				for (int i = input + 1; i <= input * 2; i++) {
					if (!decimal[i]) {
						cnt++;
					}
				}
				bw.write(String.valueOf(cnt) + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
