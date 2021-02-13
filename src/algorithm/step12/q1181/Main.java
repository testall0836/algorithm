package algorithm.step12.q1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �ܾ� ����
 * 
 * �ð� ����	- 2 �� 
 * �޸� ����	- 256 MB
 * 
 * �ҿ� �ð�	- ms 
 * �ҿ� �޸�	- KB
 * 
 * @author	testall0836
 * @date	2021. 2. 13
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		List<char[]> inputList = new ArrayList<char[]>();
		
		for (int i = 0; i < inputCnt; i++) {
			char[] in = br.readLine().toCharArray();
			inputList.add(in);
		}
		
		Collections.sort(inputList, new Comparator<char[]>() {
			@Override
			public int compare(char[] o1, char[] o2) {
				
				if (o1.length > o2.length) {
					return 1;
				} else if (o1.length == o2.length) {
					//���� �߸� �ľ�,
					//���� �ܾ�� 1ȸ ���
					for (int i = 0; i < o1.length; i++) {
						if (o1[i] > o2[i]) {
							return 1;
						}
					}
				}
				
				
				return -1;
			}
		});
		
		for (char[] str : inputList) {
			bw.write(String.valueOf(str) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}