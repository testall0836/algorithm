package algorithm.step9.q11653;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
        String firstInput = br.readLine();  // 행렬의 크기 N M 입력
        Integer[] matrixSize = Stream.of(firstInput.split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
        
        Integer[][] matrixSum = new Integer[matrixSize[0]][matrixSize[1]];

        //입력을 먼저 완료 처리해야 됨, 실패한 로직
        for ( int i = 0; i < matrixSize[0]; i++ ) {
            String InputMatrix = br.readLine(); //행렬의 행을 순서대로 입력받음
            Integer[] matrixNum = Stream.of(InputMatrix.split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
            for ( int j = 0; j < matrixSize[1]; j++ ) {
                matrixSum[i][j] += matrixNum[j];
            }
        }


        
     
        bw.flush();
        bw.close();

        br.close();
    }	
}
