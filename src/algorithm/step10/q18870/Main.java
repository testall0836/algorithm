package algorithm.step10.q18870;

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
 * 출처 : https://www.acmicpc.net/problem/18870
 * 
 * 시간 제한 : 2초
 * 메모리 제한 : 512 MB
 * 
 * 
 * @author testall0836
 * @date 2023. 1. 15
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberCnt = Integer.parseInt(br.readLine());

        System.out.println(numberCnt);
     
        bw.flush();
        bw.close();
        br.close();
    }	
}