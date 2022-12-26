package algorithm.step9.q2738;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 출처 : https://www.acmicpc.net/problem/2738
 * 
 * 시간 제한 : 1초
 * 메모리 제한 : 128 MB
 * 
 * 
 * @author testall0836
 * @date 2022. 12. 23
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 행렬 크기 얻음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 행의 개수
        int m = Integer.parseInt(st.nextToken());   // 원소 개수

        int[][] matrixSum = new int[n][m];

        for ( int i = 0; i < n*2; i++ ) {

            String line = br.readLine();

            for ( int j = 0; j < m; j++ ) {
                matrixSum[i%n][j] += Integer.parseInt(line.split(" ")[j]);
            }
        }
     
        int i = 0, j = 0;
        while ( i != matrixSum.length ) {
            while ( j != matrixSum[i].length ) {
                bw.write(matrixSum[i][j] + " ");
                j++;
            }
            j = 0;
            i++;
            bw.write("\n");
        }
     
        bw.close();
        br.close();
    }	
}
