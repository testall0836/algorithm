package algorithm.step10.q10872;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ���丮��	 
 * 
 * �ð� ����	- 1 �� 
 * �޸� ����	- 256 MB
 * 
 * �ҿ� �ð�	- 80 ms 
 * �ҿ� �޸�	- 11568 KB 
 * 
 * @author	testall0836
 * @date	2021. 1. 31
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		input = factorial(input);
		
		bw.write(String.valueOf(input));
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int factorial(int input) {
		
		if (input == 1) {
			return input;
		} else if (input == 0) {
			return 1;
		}
		
		input = input * factorial(input-1);
		
		return input;
	}
}
