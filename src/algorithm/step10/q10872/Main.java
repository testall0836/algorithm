package algorithm.step10.q10872;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 팩토리얼	 
 * 
 * 시간 제한	- 1 초 
 * 메모리 제한	- 256 MB
 * 
 * 소요 시간	- 80 ms 
 * 소요 메모리	- 11568 KB 
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
