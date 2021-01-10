package algorithm.step7.q2908;

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
			StringTokenizer st = new StringTokenizer(br.readLine()); // �� �ٿ� �� ���� �� ���ڿ��� �Է�

			String left = st.nextToken(); // ù��° ����
			String right = st.nextToken(); // �ι�° ����

			String reverseL = "";
			String reverseR = "";

			for (int i = 2; i >= 0; i--) {
				reverseL = reverseL + left.charAt(i);
				reverseR = reverseR + right.charAt(i);
			}

			if (Integer.parseInt(reverseR) > Integer.parseInt(reverseL)) {
				bw.write(reverseR);
			} else {
				bw.write(reverseL);
			}

			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
