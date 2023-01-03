package algorithm.step10.q2587;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

/**
 * 출처 : https://www.acmicpc.net/problem/2587
 * 
 * 시간 제한 : 1초
 * 메모리 제한 : 128 MB
 * 
 * 
 * @author testall0836
 * @date 2023. 1. 3
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //다섯개의 자연수 저장 배열
        int[] arr = new int[5];

        //다섯개의 자연수 평균값
        int avg = 0;

        for ( int i = 0; i < 5; i++ ) {
            arr[i] = Integer.parseInt(br.readLine());
            avg += arr[i];
        }

        Arrays.sort(arr);
        avg = avg / 5;

        bw.write(String.valueOf(avg));
        bw.write(System.lineSeparator());
        bw.write(String.valueOf(arr[2]));
     
        bw.flush();
        bw.close();
        br.close();
    }	
}