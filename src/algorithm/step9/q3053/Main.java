package algorithm.step9.q3053;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 택시 기하학
 * 
 * 시간 제한	- 1 초 
 * 메모리 제한	- 128 MB
 * 
 * 소요 시간	- 84 ms 
 * 소요 메모리	- 11916 KB
 * 
 * @author	testall0836
 * @date	2021. 1. 28
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double input = Double.parseDouble(br.readLine());
		
		double output1 = input * input * Math.PI;
		double output2 = 2 * input * input;

		bw.write(String.format("%.6f", output1));
		bw.write("\n");
		bw.write(String.format("%.6f", output2));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
