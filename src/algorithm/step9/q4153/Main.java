package algorithm.step9.q4153;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * �����ﰢ��
 * 
 * �ð� ����	- 1 �� 
 * �޸� ����	- 128 MB
 * 
 * �ҿ� �ð�	- 72 ms 
 * �ҿ� �޸�	- 11408 KB
 * 
 * @author testall0836
 * @date 2021. 1. 28
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String[] input = br.readLine().split(" ");
			int[] arr = new int[3];

			// ����
			if (input[0].equalsIgnoreCase("0") && input[1].equalsIgnoreCase("0") && input[2].equalsIgnoreCase("0")) {
				break;
			} else {
				for (int i = 0; i < input.length; i++) {
					arr[i] = Integer.valueOf(input[i]);
				}

				Arrays.sort(arr); // �������� ����

				if ((arr[0] * arr[0] + arr[1] * arr[1]) == (arr[2] * arr[2])) {
					bw.write("right");
				} else {
					bw.write("wrong");
				}
				bw.write("\n");

			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
