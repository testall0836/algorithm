package algorithm.step8.q1193;

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
			int input = Integer.parseInt(br.readLine());
			int i = 1;
			int vs = 1;
			boolean odd = true;
			int gap = 0;

			while (true) {
				if (vs < input) {
					i++;
					vs += i;
					odd = !odd;
				} else {
					gap = vs - input;

					if (odd) {
						bw.write(String.valueOf((1 + gap) + "/" + (i - gap)));
					} else {
						bw.write(String.valueOf((i - gap) + "/" + (1 + gap)));
					}
					break;
				}
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
