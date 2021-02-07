package algorithm.step12.q10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 수 정렬하기 3
 * 
 * 시간 제한	- 3 초 
 * 메모리 제한	- 8 MB
 * 
 * 소요 시간	-  2332 ms 
 * 소요 메모리	-  376272 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 8
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		int[] numArr = new int[inputCnt];
		int[] counting = new int[10001];
		int[] result = new int[inputCnt];
		
		for (int i = 0; i < inputCnt; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < numArr.length; i++) {
			counting[numArr[i]]++;
		}
		
		for (int i = 1; i < counting.length; i++) {
			counting[i] += counting[i - 1];
		}
		
		for (int i = numArr.length - 1; i >= 0; i--) {
			int value = numArr[i];
			counting[value]--;
			result[counting[value]] = value;
		}
		
		for (int i = 0; i < result.length; i++) {
			bw.write(result[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
