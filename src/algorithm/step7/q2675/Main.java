package algorithm.step7.q2675;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int tCnt = Integer.parseInt(br.readLine()); // 테스트 케이스 입력

			for (int i = 0; i < tCnt; i++) {
				String lineStr = br.readLine(); // 각 라인 입력

				// 공백 분할
				String[] str = lineStr.split(" ");
				int repeatCnt = Integer.parseInt(str[0]); // 반복할 횟수 저장

				// 실제 repeatCnt 만큼 반복 문자 , 한 문자씩 반복
				for (int z = 0; z < str[1].length(); z++) {
					for (int j = 0; j < repeatCnt; j++) {
						bw.write(String.valueOf(str[1].charAt(z)));
					}
				}
				bw.write("\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
