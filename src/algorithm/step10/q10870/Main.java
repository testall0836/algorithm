package algorithm.step10.q10870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �Ǻ���ġ �� 5
 * 
 * �ð� ����	- 1 �� 
 * �޸� ����	- 256 MB
 * 
 * �ҿ� �ð�	- 80 ms 
 * �ҿ� �޸�	- 11548 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 1
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(fibo(input)));
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int fibo(int input) {
		
		if (input == 0) {
			return 0;
		} else if (input == 1) {
			return 1;
		} else {
			return (fibo(input - 1) + fibo(input - 2));
		}
	}
}
