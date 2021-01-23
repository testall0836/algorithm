package algorithm.step9.q2581;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 소수
 * 
 * 시간 제한 - 1 초 
 * 메모리 제한 - 128 MB
 * 
 * 소요 시간 - 128 ms 
 * 소요 메모리 - 12056 KB
 * 
 * @author testall0836
 * @date 2021. 1. 23
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 1<= M <= N <= 10000
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int decimalSum = 0;
		int minDecimal = 0;

		for (int i = M; i <= N; i++) {
			int vs = 2;
			int check = 0;

			if (i == 1) { // 소수 아님
				continue;
			} else {
				while (true) {

					if (i == vs && check == 0) { // 2 이상의 숫자에서 나눠졌다?
						decimalSum += i;
						if (minDecimal == 0) { // 자연수 아닌 0과 비교하여 최초 가장 작은 소수 저장
							minDecimal = i;
						}
						break;
					} else if (i != vs && check > 0) {
						break;
					}

					if (i % vs == 0) {
						check++;
					}
					vs++;
				}
			}
		}

		if (minDecimal == 0) {
			bw.write(String.valueOf(-1));
		} else {
			bw.write(String.valueOf(decimalSum) + "\n" + String.valueOf(minDecimal));
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
