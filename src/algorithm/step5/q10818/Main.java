package algorithm.step5.q10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		int max = -1000000;
		int min = 1000000;
		int mid = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			mid = Integer.parseInt(st.nextToken());
			
			if (mid > max) {
				max = mid;
			}
			
			if (mid < min) {
				min = mid;
			}
		}
		bw.write(min + " " + max);
		
		bw.close();
		br.close();
	}
}
