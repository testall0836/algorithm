package algorithm.step8.q1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Fly me to the Alpha Centauri	 
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 512 MB
 * 
 * 소요 시간	- ms 
 * 소요 메모리	- KB 
 * 
 * @author	testall0836
 * @date	2021. 1. 29
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		
		for (int z = 0; z < inputCnt; z++) {
			String[] input = br.readLine().split(" ");
			// 최소gap 은 1
			int gap = Integer.parseInt(input[1]) - Integer.parseInt(input[0]);
			
			if (gap == 1) {
				bw.write("1" + "\n");
				continue;
			} else if (gap == 2) {
				bw.write("2" + "\n");
				continue;
			} else if (gap == 3 || gap == 4) {
				bw.write("3" + "\n");
				continue;
			}
			
			int i = 2;
			int num = 2;
			int min = 2;
			boolean ch = false;

			while (true) {
				
				for (int j = 1; j < i; j++) {
					num += i;
					min++;
					if (gap == num) {
						bw.write(String.valueOf(min+1));
						ch = true;
						break;
					} else if (gap < num) {
						bw.write(String.valueOf(min));
						ch = true;
						break;
					}
				}
				if (ch == true) {
					break;
				}
				i++;
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}	
}
