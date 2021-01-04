package algorithm.step5.q8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) { // 테스트 케이스 개수만큼 입력받기
			String input = br.readLine();
			char[] chs = input.toCharArray();
			int total = 0;
			int acc = 0;

			for (char ch : chs) { // 각 입력 케이스 배열로 전환 후 한 자리씩 O, X 체크
				if ("O".equalsIgnoreCase(Character.toString(ch))) {
					// 총점 합산하기
					acc = acc + 1;
					total = total + acc;
				} else {
					// 틀린 문제인 경우 누적값 초기화
					acc = 0;
				}
			}
			bw.write(total + "\n");
		}

		bw.close();
		br.close();
	}
}
