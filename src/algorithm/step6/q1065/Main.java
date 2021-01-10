package algorithm.step6.q1065;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int han = 0; // 한수 카운트
		int N = Integer.parseInt(br.readLine()); // 입력값 N

		for (int i = 1; i <= N; i++) {
			// 1 ~ 99 까지 는 무조건 한수 카운트
			if (i > 0 && i < 100) {
				han++;
			} else if (i == 1000) {
				break;
			} else {
				// 100 ~ 999 까지는 한수인지 자리수 사이의 등차 확인
				// 각 자리수 값 변수 저장
				int a = i / 100;
				int b = i % 100 / 10;
				int c = i % 10;
				if ((a - b) == (b - c)) {
					han++;
				}
			}
		}
		System.out.println(han);
	}
}
