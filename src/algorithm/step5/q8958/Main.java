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
		int total = 0;
		
		for (int i = 0; i < cnt; i++) {
			String input = br.readLine();
			char[] chs = input.toCharArray();
			
			for (char ch : chs) {
				if ("O".equalsIgnoreCase(Character.toString(ch))) {
					
				}
			}
		}
		
		bw.close();
		br.close();
	}
}
