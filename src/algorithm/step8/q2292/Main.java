package algorithm.step8.q2292;

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
			int cnt = 1;
			int input = Integer.parseInt(br.readLine());
			int vs = 1;
			while (true) {
				if (input <= vs) {
					break;
				} else {
					vs = vs + (cnt * 6);
					cnt++;					
				}
			}
			
			bw.write(String.valueOf(cnt));
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
