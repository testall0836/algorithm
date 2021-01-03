package algorithm.step5.q1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		float cnt = Long.parseLong(br.readLine());	//���� ����
		
		float input = 0;
		float max = 0;
		float sum = 0;
		
		String inputs = br.readLine();	// ���ٷ� �� ���� �о����
		StringTokenizer st = new StringTokenizer(inputs);
		
		while (st.hasMoreTokens()) {
			input = Long.parseLong(st.nextToken());
			
			if (max < input) {
				max = input;
			}
			
			sum = sum + input;
		}
		
		sum = sum * 100 / cnt / max;
		bw.write(String.valueOf(sum));
		
		bw.close();
		br.close();
	}
}
