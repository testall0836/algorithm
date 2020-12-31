package algorithm.step3.q10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int[] sums = new int[cnt];
		
		for (int i=0; i<cnt; i++) {
			String input = br.readLine();
			String[] inputs = input.split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			
			sums[i] = a+b;
			System.out.println(sums[i]);
		}
	}
}
