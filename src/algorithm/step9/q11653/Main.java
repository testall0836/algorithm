package algorithm.step9.q11653;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 소수 찾기
 * 
 * 시간 제한 - 1 초 
 * 메모리 제한 - 256 MB
 * 
 * 소요 시간	- 120 ms 
 * 소요 메모리	- 11864 KB
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
