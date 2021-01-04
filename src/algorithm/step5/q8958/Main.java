package algorithm.step5.q8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) { // �׽�Ʈ ���̽� ������ŭ �Է¹ޱ�
			String input = br.readLine();
			char[] chs = input.toCharArray();
			int total = 0;
			int acc = 0;

			for (char ch : chs) { // �� �Է� ���̽� �迭�� ��ȯ �� �� �ڸ��� O, X üũ
				if ("O".equalsIgnoreCase(Character.toString(ch))) {
					// ���� �ջ��ϱ�
					acc = acc + 1;
					total = total + acc;
				} else {
					// Ʋ�� ������ ��� ������ �ʱ�ȭ
					acc = 0;
				}
			}
			bw.write(total + "\n");
		}

		bw.close();
		br.close();
	}
}
