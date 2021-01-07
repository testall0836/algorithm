package algorithm.step5.q4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine()); // 첫 줄에 입력받을 테스트 케이스 개수
		int[] studentCnt = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			String testCase = br.readLine(); // 테스트 케이스 한 줄씩 입력받기
			String[] line = testCase.split(" "); // 입력받은 한줄 문자 배열로 쪼개기
			double avg = 0;
			double total = 0;

			for (int j = 0; j < line.length; j++) {
				if (j == 0) {
					studentCnt[i] = Integer.parseInt(line[j]); // 각 라인의 첫번째 값 저장
				} else {
					total = total + Integer.parseInt(line[j]); // 각 라인의 총합					
				}
			}

			avg = total / studentCnt[i]; // 평균값 연산

			int overAvg = 0; // 평균점수 이상인 인원
			for (int z = 1; z < line.length; z++) {
				if (Integer.parseInt(line[z]) > avg) {
					overAvg++;
				}
			}
			double out = (double) overAvg / (double) studentCnt[i] * 100;

			bw.write(String.format("%.3f", out) + "%\n");

		}
		bw.close();
		br.close();
	}
}
