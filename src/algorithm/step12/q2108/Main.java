package algorithm.step12.q2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
 * 통계학
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 256 MB
 * 
 * 소요 시간	- 1036 ms 
 * 소요 메모리	- 63120 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 11
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		double sum = 0;
		double avg = 0;
		int modeValue = -1;
		List<Integer> numbers = new ArrayList<Integer>();
		Map<Integer, Integer> modeNum = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < inputCnt; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
			sum += numbers.get(i);
			
			if (modeNum.containsKey(numbers.get(i))) {
				int value = modeNum.get(numbers.get(i));
				modeNum.put(numbers.get(i), value + 1);
			} else {
				modeNum.put(numbers.get(i), 1);
			}
		}
		
		Collections.sort(numbers);
		
		avg = sum/inputCnt;
		
		//최빈값 정렬 완료
		List<Entry<Integer, Integer>> list_entries = new ArrayList<Map.Entry<Integer,Integer>>(modeNum.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				if (o2.getValue().compareTo(o1.getValue()) > 0) {
					return o2.getValue().compareTo(o1.getValue());
				} else if (o2.getValue().compareTo(o1.getValue()) == 0) {
					return o1.getKey().compareTo(o2.getKey());				
				}
				return -1;
			}
		});
		
		//리스트가 2개 이상인 경우 1번 2번 비교
		if (list_entries.size() > 1) {
			//최빈 단독
			if (list_entries.get(0).getValue() > list_entries.get(1).getValue()) {
				modeValue = list_entries.get(0).getKey();
			} else {
				//동일값 여럿
				modeValue = list_entries.get(1).getKey();
			}
			
		} else {
			modeValue = list_entries.get(0).getKey();
		}
		
		bw.write(String.format("%.0f", avg) + "\n");
		bw.write(numbers.get(inputCnt/2) + "\n");
		bw.write(modeValue + "\n");
		bw.write(Collections.max(numbers) - Collections.min(numbers) + "\n");

		
		bw.flush();
		bw.close();
		br.close();
	}
}
