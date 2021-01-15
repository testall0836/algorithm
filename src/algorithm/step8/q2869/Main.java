package algorithm.step8.q2869;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int A = Integer.parseInt(st.nextToken()); // ���� ������ ����
			int B = Integer.parseInt(st.nextToken()); // �㿡 ������ ����
			int V = Integer.parseInt(st.nextToken()); // ���� ����

			double total = 1 + (double) (V - A) / (double) (A - B);
			bw.write(String.valueOf(Math.round(Math.ceil(total))));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
