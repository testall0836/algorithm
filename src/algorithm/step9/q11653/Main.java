package algorithm.step9.q11653;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �Ҽ� ã��
 * 
 * �ð� ���� - 1 �� 
 * �޸� ���� - 256 MB
 * 
 * �ҿ� �ð�	- 120 ms 
 * �ҿ� �޸�	- 11864 KB
 * 
 * @author testall0836
 * @date 2021. 1. 23
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(br.readLine());
		int i = 2;

		while (true) {
			if (input % i == 0) {
				input = input / i;
				bw.write(String.valueOf(i) + "\n");
			} else {
				i++;
			}

			if (input == 1) {
				break;
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
