package algorithm.step12.q2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 통계학
 * 
 * 시간 제한	- 2 초 
 * 메모리 제한	- 256 MB
 * 
 * 소요 시간	-   ms 
 * 소요 메모리	-   KB
 * 
 * @author	testall0836
 * @date	2021. 2. 10
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		double sum = 0;
		double avg = 0;
		int[] nums = new int[inputCnt];
		Map<Integer, Integer> mode = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < inputCnt; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
			
			if (mode.containsKey(nums[i])) {
				int prev = mode.get(nums[i]);
				mode.put(nums[i], prev + 1);
			} else {
				mode.put(nums[i], 1);
			}
		}
		
		Arrays.sort(nums);
		
		avg = sum/inputCnt;
		bw.write(String.format("%.0f", avg) + "\n");
		bw.write(nums[inputCnt/2] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
