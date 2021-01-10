package algorithm.step7.q2675;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int tCnt = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽� �Է�

			for (int i = 0; i < tCnt; i++) {
				String lineStr = br.readLine(); // �� ���� �Է�

				// ���� ����
				String[] str = lineStr.split(" ");
				int repeatCnt = Integer.parseInt(str[0]); // �ݺ��� Ƚ�� ����

				// ���� repeatCnt ��ŭ �ݺ� ���� , �� ���ھ� �ݺ�
				for (int z = 0; z < str[1].length(); z++) {
					for (int j = 0; j < repeatCnt; j++) {
						bw.write(String.valueOf(str[1].charAt(z)));
					}
				}
				bw.write("\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
