package algorithm.step8.q1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Fly me to the Alpha Centauri	 
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 512 MB
 * 
 * 소요 시간	- ms (시간초과 실패)
 * 소요 메모리	- KB 
 * 
 * @author	testall0836
 * @date	2021. 2. 2
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < inputCnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			int gap = right - left - 2; // 지점 간의 거리 - 시작과 끝의 이동(1) 미리 차감
			
			int minMovement = 2;	// 거리가 최소 3이라는 가정하에 처음과 마지막 이동횟수 미리 카운트
			int vsGap = 0;
			boolean ch = false;
			
			for (int j = 2; ; j++) {
				
				if (ch == true) {
					break;
				}
				
				for (int z = 0; z < 2; z++) { // 각 j 인덱스의 2회 반복
										
					vsGap = vsGap + j;
					minMovement++;	//이동 횟수 증가
					
					if (vsGap >= gap && vsGap - gap < j) {
						bw.write(String.valueOf(minMovement) + "\n");
						ch = true;
						break;
					}
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
