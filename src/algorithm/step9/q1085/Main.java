package algorithm.step9.q1085;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * ���簢������ Ż��
 * 
 * �ð� ����	- 2 �� 
 * �޸� ����	- 128 MB
 * 
 * �ҿ� �ð�	- 80 ms 
 * �ҿ� �޸�	- 11592 KB
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
