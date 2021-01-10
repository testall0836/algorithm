package algorithm.step7.q1157;

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

		Map<String, Integer> alpha = new HashMap<String, Integer>();
		int vs = 0;
		String out = null;
		boolean two = false; // 최대치가 같은 단어가 둘 이상인 경우

		try {
			String str = br.readLine(); // 65 ~ 90 , 97 ~ 122
			str = str.toLowerCase();

			for (int i = 0; i < str.length(); i++) {
				if (alpha.containsKey(str.substring(i, i + 1))) {
					int value = alpha.get(str.substring(i, i + 1));
					alpha.put(str.substring(i, i + 1), value + 1);
				} else {
					alpha.put(str.substring(i, i + 1), 1);
				}
			}

			for (String key : alpha.keySet()) {
				if (vs < alpha.get(key)) {
					vs = alpha.get(key);
					out = key;
					two = false;
				} else if (vs == alpha.get(key)) {
					two = true;
				}
			}

			if (two == true) {
				bw.write("?");
			} else {
				bw.write(String.valueOf(out.toUpperCase()));
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