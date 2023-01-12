package algorithm.step10.q2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * 출처 : https://www.acmicpc.net/problem/2108
 * 
 * 시간 제한 : 2초
 * 메모리 제한 : 256 MB
 * 
 * 
 * @author testall0836
 * @date 2023. 1. 12
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int numCnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[numCnt];
        Map<Integer, Integer> listforMode = new HashMap<>();

        for (int i = 0; i < numCnt; i++) {
            numArr[i] = Integer.parseInt(br.readLine());

            if ( listforMode.containsKey(numArr[i]) ) {
                //기존에 값이 있으면 value 누적
                int addValue = listforMode.get(numArr[i]) + 1;
                listforMode.put(numArr[i], addValue);
            } else {
                listforMode.put(numArr[i], 1);
            }
        }

        double avg = Arrays.stream(numArr).average().orElse(numCnt);
        
        int median = Arrays.stream(numArr).sorted().toArray()[numArr.length / 2];

        //최빈값이 여러개인 경우 두번째 값을 출력
        int mode = listforMode.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        
        int max = Arrays.stream(numArr).max().getAsInt();
        int min = Arrays.stream(numArr).min().getAsInt();
        
        bw.write(String.valueOf(Math.round(avg)) + "\n");
        bw.write(String.valueOf(median) + "\n");
        bw.write(String.valueOf(mode) + "\n");
        bw.write(String.valueOf(max - min));
                    


        bw.flush();
        bw.close();
        br.close();
    }	
}