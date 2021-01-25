package algorithm.step9.q4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 베르트랑 공준
 * 
 * 시간 제한 - 1 초 
 * 메모리 제한 - 256 MB
 * 
 * 소요 시간 - 144 ms 
 * 소요 메모리 - 12924 KB
 * 
 * @author testall0836
 * @date 2021. 1. 25
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int maxN = 123456 * 2;

		// 최대 범위까지의 소수 구하기
		boolean[] decimal = new boolean[maxN + 1];

		// 인덱스 0, 1은 소수가 아님
		decimal[0] = true;
		decimal[1] = true;

		for (int i = 2; i <= maxN; i++) {
			// 소수 판정이 된 인덱스는 건너뛰기
			if (decimal[i]) {
				continue;
			}

			// 소수의 배수들은 true 로 배제시킨다.
			for (int j = 2 * i; j <= maxN; j += i) {
				decimal[j] = true;
			}

		}

		while (true) {
			int input = Integer.parseInt(br.readLine());
			int cnt = 0;

			if (input == 0) {
				break;
			} else {
				for (int i = input + 1; i <= input * 2; i++) {
					if (!decimal[i]) {
						cnt++;
					}
				}
				bw.write(String.valueOf(cnt) + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
