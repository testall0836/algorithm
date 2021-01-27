package algorithm.step9.q3009;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

/**
 * �� ��° ��
 * 
 * �ð� ����	- 1 �� 
 * �޸� ����	- 128 MB
 * 
 * �ҿ� �ð�	- 76 ms 
 * �ҿ� �޸�	- 11572 KB
 * 
 * @author	testall0836
 * @date	2021. 1. 28
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		TreeMap<String, Boolean> x = new TreeMap<String, Boolean>();
		TreeMap<String, Boolean> y = new TreeMap<String, Boolean>();
		
		
		for (int i = 0; i < 3; i ++) {
			String[] input = br.readLine().split(" ");
			
			if (x.containsKey(input[0])) {
				x.remove(input[0]);
			} else {
				x.put(input[0], true);
			}
			
			if (y.containsKey(input[1])) {
				y.remove(input[1]);
			} else {
				y.put(input[1], true);
			}
		}
		bw.write(x.firstKey() + " " + y.firstKey());
		bw.flush();
		bw.close();
		br.close();
	}
}
