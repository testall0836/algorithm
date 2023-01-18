package algorithm.step10.q18870;

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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 출처 : https://www.acmicpc.net/problem/25501
 * 
 * 시간 제한 : 2초
 * 메모리 제한 : 1024 MB
 * 
 * 
 * @author testall0836
 * @date 2023. 1. 18
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberCnt = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split(" ");
        int[] pointList = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        int[] points = Arrays.stream(numbers).distinct().mapToInt(Integer::parseInt).sorted().toArray();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            map.put(points[i], i);
        }

        for (int j = 0; j < pointList.length; j++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() == pointList[j]) {
                    System.out.print(entry.getValue());
                }
            }
            if (j != pointList.length-1) {
                System.out.print(" ");
            }
        }
        
     
        bw.flush();
        bw.close();
        br.close();
    }	
}