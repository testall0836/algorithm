package algorithm.step2.q2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] inputs = input.split(" ");
		
		int input1 = Integer.parseInt(inputs[0]);
		int input2 = Integer.parseInt(inputs[1]);
		
		int total = input1 * 60 + input2;
		
		if (total < 45) {
			total = total - 45 + 1440;
		} else {
			total = total - 45;
		}
		
		input1 = total/60;
		input2 = total%60;
		System.out.println(input1 + " " + input2); 
	}
}