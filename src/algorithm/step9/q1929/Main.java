package algorithm.step9.q1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 소수 구하기
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 256 MB
 * 
 * 소요 시간	- ms 
 * 소요 메모리	- KB
 * 
 * @author testall0836
 * @date 2021. 1. 23
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long startTime = System.currentTimeMillis();
		
		String[] input = br.readLine().split(" ");
		
		//  (1 ≤ M ≤ N ≤ 1,000,000)
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		
		int pn = N - M;
		boolean[] isPrime = new boolean[pn+1];
		
		for (int i = 2; i <=M; i++) {
			if (isPrime[i]) {
				continue;
			}
			
			for (int j=2*i; j<=M; j+=i) {
				isPrime[j] = true;
			}
		}
		
		
		long endTime = System.currentTimeMillis();
		bw.write(String.valueOf(endTime-startTime));
		bw.flush();
		bw.close();
		br.close();
	}
}
