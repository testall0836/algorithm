package algorithm.step1.q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String in1 = sc.nextLine();
		String in2 = sc.nextLine();
		
		int input1 = Integer.parseInt(in1);
		char[] input2 = in2.toCharArray();
		
		int out3 = input1 * Integer.parseInt(String.valueOf(input2[2]));
		int out4 = input1 * Integer.parseInt(String.valueOf(input2[1]));
		int out5 = input1 * Integer.parseInt(String.valueOf(input2[0]));
		
		System.out.println(out3);
		System.out.println(out4);
		System.out.println(out5);
		
		int out6 = out3 + (out4 * 10) + (out5 * 100);
		System.out.println(out6);
	}
}