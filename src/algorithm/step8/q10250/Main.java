package algorithm.step8.q10250;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int cnt = Integer.parseInt(br.readLine()); // 입력 행수

			for (int i = 0; i < cnt; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int H = Integer.parseInt(st.nextToken()); // 높이
				int W = Integer.parseInt(st.nextToken()); // 최대 호수
				int N = Integer.parseInt(st.nextToken()); // 손님 배정 순번
				int roomNumber = 0;

				if (N % H == 0) {
					roomNumber = H * 100 + (N / H);
				} else {
					roomNumber = N % H * 100 + ((N / H) + 1);
				}
				bw.write(String.valueOf(roomNumber) + "\n");
			}

			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
