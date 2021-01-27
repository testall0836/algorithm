package algorithm.step9.q1085;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 직사각형에서 탈출
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 128 MB
 * 
 * 소요 시간	- 80 ms 
 * 소요 메모리	- 11592 KB
 * 
 * @author	testall0836
 * @date	2021. 1. 26
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int shortestX = 0;
		int shortestY = 0;
		
		if(Math.abs(w - x) > x) {
			shortestX = x;
		} else {
			shortestX = Math.abs(w - x);
		}
		
		if(Math.abs(h - y) > y) {
			shortestY = y;
		} else {
			shortestY = Math.abs(h - y);
		}
		
		if (shortestX > shortestY) {
			bw.write(String.valueOf(shortestY));
		} else {
			bw.write(String.valueOf(shortestX));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
