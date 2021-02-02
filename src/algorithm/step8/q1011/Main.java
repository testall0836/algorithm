package algorithm.step8.q1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Fly me to the Alpha Centauri	 
 * 
 * �ð� ����	- 2 �� 
 * �޸� ����	- 512 MB
 * 
 * �ҿ� �ð�	- 84 ms
 * �ҿ� �޸�	- 12068 KB 
 * 
 * @author	testall0836
 * @date	2021. 2. 2
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < inputCnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			int gap = right - left; // ���� ���� �Ÿ� - ���۰� ���� �̵�(1) �̸� ����
		
			bw.write(String.format("%d", (int)Math.ceil(Math.sqrt(gap)*2-1)) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}
