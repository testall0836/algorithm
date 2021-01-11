package algorithm.step7.q2941;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int total = 0; // �Է¹��� ���ڿ����� ������ ũ�ξ�Ƽ�� ���ڿ� ����

		try {
			char[] input = br.readLine().toCharArray(); // ũ�ξ�Ƽ�� ���ڿ� �Է�

			for (int i = 0; i < input.length; i++) {
				if (input[i] == 'c' && input.length > i + 1) {
					if (input[i + 1] == '=' || input[i + 1] == '-') {
						i++;
					}
				} else if (input[i] == 'd' && input.length > i + 1) {
					
					if (input[i + 1] == '-') {
						i++;
					} else if (input[i + 1] == 'z' && input.length > i + 2) {
						if (input[i + 2] == '=') {
							i = i + 2;
						}	
					}
				} else if ((input[i] == 'l' || input[i] == 'n') && input.length > i + 1) {
					if (input[i + 1] == 'j') {
						i++;
					}
				} else if ((input[i] == 's' || input[i] == 'z') && input.length > i + 1) {
					if (input[i + 1] == '=') {
						i++;
					}
				}

				total++;
			}

			bw.write(String.valueOf(total));
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}