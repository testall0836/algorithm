package algorithm.step8.q10757;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 큰 수 A+B 시간 제한	- 1초 
 * 메모리 제한 			- 256 MB
 * 
 * 소요 시간			- 100 ms 
 * 소요 메모리			- 12616 KB
 * 
 * @author testall0836
 * @date 2021. 1. 18
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = st.nextToken();
		String b = st.nextToken();
		int gap = 0;

		if (a.length() > b.length()) {
			gap = a.length() - b.length();

			for (int i = 0; i < gap; i++) {
				b = "0" + b;
			}
		} else if (a.length() < b.length()) {
			gap = b.length() - a.length();

			for (int i = 0; i < gap; i++) {
				a = "0" + a;
			}
		}

		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();

		int size = aa.length + 1;

		int[] sum = new int[size];
		int carry = 0;

		for (int i = size - 1; i >= 0; i--) {
			int total = 0;

			if (i == 0) { // 마지막 인덱스인 경우
				sum[i] = carry;
				break;
			}

			total = Character.getNumericValue(aa[i - 1]) + Character.getNumericValue(bb[i - 1]) + carry;

			if (total != 0) {
				sum[i] = total % 10;
				carry = total / 10;

			} else {
				sum[i] = 0;
				carry = 0;
			}

		}

		for (int i = 0; i < sum.length; i++) {
			if (i == 0 && sum[i] == 0) {

			} else {
				bw.write(String.valueOf(sum[i]));
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
