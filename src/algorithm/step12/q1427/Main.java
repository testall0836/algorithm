package algorithm.step12.q1427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ��Ʈ�λ��̵�
 * 
 * �ð� ����	- 2 �� 
 * �޸� ����	- 128 MB
 * 
 * �ҿ� �ð�	- 88 ms 
 * �ҿ� �޸�	- 11860 KB
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
