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
 * �ҿ� �ð�	- ms (�ð��ʰ� ����)
 * �ҿ� �޸�	- KB 
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
			int gap = right - left - 2; // ���� ���� �Ÿ� - ���۰� ���� �̵�(1) �̸� ����
			
			int minMovement = 2;	// �Ÿ��� �ּ� 3�̶�� �����Ͽ� ó���� ������ �̵�Ƚ�� �̸� ī��Ʈ
			int vsGap = 0;
			boolean ch = false;
			
			for (int j = 2; ; j++) {
				
				if (ch == true) {
					break;
				}
				
				for (int z = 0; z < 2; z++) { // �� j �ε����� 2ȸ �ݺ�
										
					vsGap = vsGap + j;
					minMovement++;	//�̵� Ƚ�� ����
					
					if (vsGap >= gap && vsGap - gap < j) {
						bw.write(String.valueOf(minMovement) + "\n");
						ch = true;
						break;
					}
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
