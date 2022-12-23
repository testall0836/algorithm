package algorithm.step9.q11653;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 출처 : https://www.acmicpc.net/problem/2738
 * 
 * 시간 제한 : 1초
 * 메모리 제한 : 128 MB
 * 
 * 
 * @author testall0836
 * @date 2022. 12. 23
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
