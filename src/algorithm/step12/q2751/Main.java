package algorithm.step12.q2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �� �����ϱ� 2
 * 
 * �ð� ����	- 2 �� 
 * �޸� ����	- 256 MB
 * 
 * �ҿ� �ð�	- 1468 ms 
 * �ҿ� �޸�	- 163228 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 7
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		List<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < inputCnt; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}		
		Collections.sort(arr);

		for (int in : arr) {
			bw.write(in + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
