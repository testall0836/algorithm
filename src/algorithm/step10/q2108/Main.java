package algorithm.step10.q2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 출처 : https://www.acmicpc.net/problem/2108
 * 
 * 시간 제한 : 1초
 * 메모리 제한 : 256 MB
 * 
 * 
 * @author testall0836
 * @date 2023. 1. 8
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int numCnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[numCnt];

        for (int i = 0; i < numCnt; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        double avg = Arrays.stream(numArr).average().orElse(numCnt);
        int max = Arrays.stream(numArr).max().getAsInt();
        int min = Arrays.stream(numArr).min().getAsInt();

        System.out.println(Math.round(avg));
        System.out.println(max - min);
     
        bw.flush();
        bw.close();
        br.close();
    }	
}