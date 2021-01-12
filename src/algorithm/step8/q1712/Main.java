package algorithm.step8.q1712;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int staticPrice = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());
			int laptopPrice = Integer.parseInt(st.nextToken());

			int total = 0;
			int i = 0;
			while (true) {
				if ((staticPrice) < (laptopPrice-price) * i) {
					break;
				}
				i++;
			}
			bw.write(String.valueOf(i));
			
			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
