package algorithm.step8.q2839;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ���� ���
 * 
 * �ð� ����, �޸� ���� - 1 ��, 128 MB �ҿ� �ð�, �ҿ� �޸�
 * 
 * @author testall0836
 * @date 2021. 1. 17
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(br.readLine());
		int maxFive = 0;
		int maxThree = 0;

		maxFive = input / 5;

		for (int i = maxFive; i >= 0; i--) {
			if ((input - 5 * i) % 3 == 0) {

				maxThree = (input - 5 * i) / 3;
				bw.write(String.valueOf(i + maxThree));
				break;
			}

			if (i == 0) {
				bw.write(String.valueOf(-1));
				break;
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
