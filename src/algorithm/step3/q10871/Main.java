package algorithm.step3.q10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = 0;
		int X = 0;
		int tok = 0;

		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) {
			tok = Integer.parseInt(st.nextToken());
			if (X > tok) {
				bw.write(tok + " ");
			}
		}
		bw.close();
		br.close();
	}
}
