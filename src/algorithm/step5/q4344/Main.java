package algorithm.step5.q4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine()); // ù �ٿ� �Է¹��� �׽�Ʈ ���̽� ����
		int[] studentCnt = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			String testCase = br.readLine(); // �׽�Ʈ ���̽� �� �پ� �Է¹ޱ�
			String[] line = testCase.split(" "); // �Է¹��� ���� ���� �迭�� �ɰ���
			double avg = 0;
			double total = 0;

			for (int j = 0; j < line.length; j++) {
				if (j == 0) {
					studentCnt[i] = Integer.parseInt(line[j]); // �� ������ ù��° �� ����
				} else {
					total = total + Integer.parseInt(line[j]); // �� ������ ����					
				}
			}

			avg = total / studentCnt[i]; // ��հ� ����

			int overAvg = 0; // ������� �̻��� �ο�
			for (int z = 1; z < line.length; z++) {
				if (Integer.parseInt(line[z]) > avg) {
					overAvg++;
				}
			}
			double out = (double) overAvg / (double) studentCnt[i] * 100;

			bw.write(String.format("%.3f", out) + "%\n");

		}
		bw.close();
		br.close();
	}
}
