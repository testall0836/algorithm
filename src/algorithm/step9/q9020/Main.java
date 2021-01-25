package algorithm.step9.q9020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �������� ����
 * 
 * �ð� ����	- 2 �� 
 * �޸� ����	- 256 MB
 * 
 * �ҿ� �ð�	- 236 ms 
 * �ҿ� �޸�	- 14604 KB
 * 
 * @author testall0836
 * @date 2021. 1. 25
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 10000;
		boolean[] decimal = new boolean[max + 1];
		
		decimal[0] = true;
		decimal[1] = true;
		
		for (int i = 2; i <= max; i++) {
			if (decimal[i]) {
				continue;
			}
			for (int j = 2*i; j <= max; j+=i) {
				decimal[j] = true;
			}
		}
		
		int input = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < input; i++) {
			int num = Integer.parseInt(br.readLine());	//������ ��Ƽ���� ���� ���� n
			int partA = 0;
			int partB = 0;
			int gap = 100000;
			
			for (int j = 2; j <= num; j++) {
				if (decimal[j] == false) {
					if (decimal[num - j] == false) {
						if (gap > Math.abs(num - j - j)) {
							gap = Math.abs(num - j - j);
							partA = num - j;
							partB = j;
						}
					}
				}
			}
			bw.write(partB + " " + partA + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
