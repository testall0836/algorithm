package algorithm.step12.q2750;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * �� �����ϱ�
 * 
 * �ð� ����	- 1 �� 
 * �޸� ����	- 128 MB
 * 
 * �ҿ� �ð�	-  88 ms 
 * �ҿ� �޸�	-  12016 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 6
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		
		int[] arr = new int[inputCnt];
		
		for (int i = 0; i < inputCnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
