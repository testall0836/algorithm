package algorithm.step10.q2447;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 별 찍기 - 10
 * 
 * 시간 제한	- 1 초 
 * 메모리 제한	- 256 MB
 * 
 * 소요 시간	- 332 ms 
 * 소요 메모리	- 22788 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 17
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		char[][] coordinate = new char[input][input];
		
		for (int i = 0; i < coordinate.length; i++) {
			for (int j = 0; j < coordinate.length; j++) {
				coordinate[i][j] = ' ';
			}
		}
		
		star(coordinate, 0, 0, input);
		
		//출력
		for (int i = 0; i < coordinate.length; i++) {
			for (int j = 0; j < coordinate.length; j++) {
				bw.write(coordinate[i][j]);
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void star(char[][] coordinate, int x, int y, int n) {
		
		if (n == 1) {
			coordinate[x][y] = '*';
			return;
		} else {
			
			int divide = n/3;
			int cnt = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					cnt++;
					if (cnt != 5) {
						star(coordinate, i*divide + x, j*divide + y, divide);								
					}
				}
			}
			
		}
	}
}
