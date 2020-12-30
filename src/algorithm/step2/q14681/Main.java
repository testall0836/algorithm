package algorithm.step2.q14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input1 = Integer.parseInt(br.readLine());
		int input2 = Integer.parseInt(br.readLine());
		
		if (input1 > 0 && input2 > 0) {
			System.out.println(1);
		} else if (input1 < 0 && input2 > 0) {
			System.out.println(2);
		} else if (input1 < 0 && input2 < 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
	}
}
