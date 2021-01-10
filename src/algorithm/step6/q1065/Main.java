package algorithm.step6.q1065;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int han = 0; // �Ѽ� ī��Ʈ
		int N = Integer.parseInt(br.readLine()); // �Է°� N

		for (int i = 1; i <= N; i++) {
			// 1 ~ 99 ���� �� ������ �Ѽ� ī��Ʈ
			if (i > 0 && i < 100) {
				han++;
			} else if (i == 1000) {
				break;
			} else {
				// 100 ~ 999 ������ �Ѽ����� �ڸ��� ������ ���� Ȯ��
				// �� �ڸ��� �� ���� ����
				int a = i / 100;
				int b = i % 100 / 10;
				int c = i % 10;
				if ((a - b) == (b - c)) {
					han++;
				}
			}
		}
		System.out.println(han);
	}
}
