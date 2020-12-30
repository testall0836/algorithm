package algorithm.step2.q2753;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int input2 = Integer.parseInt(input);
		
		if ((input2%400 == 0) || ((input2 % 4 == 0) && !(input2 % 100 == 0))) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}