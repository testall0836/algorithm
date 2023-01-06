package algorithm.step10.q25305;

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
 * 출처 : https://www.acmicpc.net/problem/25305
 * 
 * 시간 제한 : 1초
 * 메모리 제한 : 1024 MB
 * 
 * 
 * @author testall0836
 * @date 2023. 1. 7
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] firstInput = br.readLine().split(" ");
        int total = Integer.parseInt(firstInput[0]);
        int cutLine = Integer.parseInt(firstInput[1]) - 1;

        String[] scoreList = br.readLine().split(" ");
        int[] scores = new int[total];
        for (int i = 0; i < total; i++) {
            scores[i] = Integer.parseInt(scoreList[i]);
        }

        scores = Arrays.stream(scores).boxed().sorted(Collections.reverseOrder()).mapToInt(x -> x).toArray();

        bw.write(String.valueOf(scores[cutLine]));
     
        bw.flush();
        bw.close();
        br.close();
    }	
}