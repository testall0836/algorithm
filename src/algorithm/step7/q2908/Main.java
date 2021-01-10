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
			StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄에 두 개의 수 문자열로 입력

			String left = st.nextToken(); // 첫번째 숫자
			String right = st.nextToken(); // 두번째 숫자

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
