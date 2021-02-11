package algorithm.step12.q1427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 소트인사이드
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 128 MB
 * 
 * 소요 시간	- 88 ms 
 * 소요 메모리	- 11860 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 12
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = br.readLine().toCharArray();
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			numbers.add(Character.getNumericValue(arr[i]));
		}
		
		Collections.sort(numbers);
		Collections.reverse(numbers);
		
		for (int i = 0; i < numbers.size(); i++) {
			bw.write(String.format("%d", numbers.get(i)));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
