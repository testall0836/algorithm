package algorithm.step9.q1002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 터렛
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 128 MB
 * 
 * 소요 시간	- 84 ms 
 * 소요 메모리	- 12256 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 5
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < inputCnt; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double r1 = Double.parseDouble(st.nextToken());
			
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double r2 = Double.parseDouble(st.nextToken());
			
			double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			
			if (dist > (r1 + r2)) {
				bw.write("0");
			} else if (dist < Math.abs(r1 - r2)) {
				bw.write("0");
			} else if (dist == 0 && r1 == r2) {
				bw.write("-1");
			} else if (dist == (r1 + r2)) {
				bw.write("1");
			} else if (dist == Math.abs(r1 - r2)) {
				bw.write("1");
			} else {
				bw.write("2");
			}
			
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
