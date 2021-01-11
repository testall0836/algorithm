package algorithm.step7.q1316;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<String, Integer> words;
		int groupWordCnt = 0;

		try {
			int cnt = Integer.parseInt(br.readLine());

			for (int i = 0; i < cnt; i++) {
				words = new HashMap<String, Integer>(); // 문자열 , 마지막 인덱스 세트
				String input = br.readLine(); // 각 라인 단어 입력

				for (int j = 0; j < input.length(); j++) {
					String key = String.valueOf(input.charAt(j));
					if (!words.containsKey(key)) {
						// 해당 문자열이 처음 등장하는 경우 해당 문자열, 마지막 인덱스 저장
						words.put(input.substring(j, j + 1), j);
					} else {
						// 해당 문자열이 이미 있는 상황이면 연속된(aa) 상태인지 확인 필요
						if (words.get(key) == j - 1) {
							// 연속된 문자열 확인
							words.put(input.substring(j, j + 1), j);
						} else {
							// 비연속 문자열이므로 종료
							break;
						}
					}

					if (j == input.length() - 1) {
						groupWordCnt++; // 마지막 인덱스까지 체크 완료했으면 성공
					}
				}
			}

			bw.write(String.valueOf(groupWordCnt));
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