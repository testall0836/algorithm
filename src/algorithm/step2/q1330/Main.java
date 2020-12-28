package algorithm.step2.q1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] strs = input.split(" ");
		
		Integer a = Integer.valueOf(strs[0]);
		Integer b = Integer.valueOf(strs[1]);
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}