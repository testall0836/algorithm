package algorithm.step8.q10757;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * ū �� A+B
 * �ð� ����	-	1��
 * �޸� ����	-	256 MB
 * 
 * �ҿ� �ð�
 * �ҿ� �޸�
 * 
 * @author	testall0836
 * @date	2021. 1. 18
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long total = a + b;
		bw.write(String.valueOf(total));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
