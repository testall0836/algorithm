package algorithm.step12.q1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 단어 정렬
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 256 MB
 * 
 * 소요 시간	- 340 ms 
 * 소요 메모리	- 33716 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 14
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		Map<String, Integer> inputMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < inputCnt; i++) {
			String input = br.readLine();
			inputMap.put(input, input.toCharArray().length);
		}
		
		List<Entry<String, Integer>> list = new ArrayList<>(inputMap.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				if (o1.getValue() > o2.getValue()) {
					return 1;
				} else if (o1.getValue() == o2.getValue()) {
					return o1.getKey().compareTo(o2.getKey());
				}
				
				return -1;
			}
		});

		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i).getKey() + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}