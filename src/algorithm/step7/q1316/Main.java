package algorithm.step7.q1316;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<String, Integer> words;
		int groupWordCnt = 0;

		try {
			int cnt = Integer.parseInt(br.readLine());

			for (int i = 0; i < cnt; i++) {
				words = new HashMap<String, Integer>(); // ���ڿ� , ������ �ε��� ��Ʈ
				String input = br.readLine(); // �� ���� �ܾ� �Է�

				for (int j = 0; j < input.length(); j++) {
					String key = String.valueOf(input.charAt(j));
					if (!words.containsKey(key)) {
						// �ش� ���ڿ��� ó�� �����ϴ� ��� �ش� ���ڿ�, ������ �ε��� ����
						words.put(input.substring(j, j + 1), j);
					} else {
						// �ش� ���ڿ��� �̹� �ִ� ��Ȳ�̸� ���ӵ�(aa) �������� Ȯ�� �ʿ�
						if (words.get(key) == j - 1) {
							// ���ӵ� ���ڿ� Ȯ��
							words.put(input.substring(j, j + 1), j);
						} else {
							// �񿬼� ���ڿ��̹Ƿ� ����
							break;
						}
					}

					if (j == input.length() - 1) {
						groupWordCnt++; // ������ �ε������� üũ �Ϸ������� ����
					}
				}
			}

			bw.write(String.valueOf(groupWordCnt));
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