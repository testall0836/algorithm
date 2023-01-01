package algorithm.step9.q2563;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 출처 : https://www.acmicpc.net/problem/2563
 * 
 * 시간 제한 : 1초
 * 메모리 제한 : 128 MB
 * 
 * 메모리 : 11528 KB
 * 시간 :   88 ms
 * 
 * @author testall0836
 * @date 2023. 1. 2
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //가로 101, 세로 101 정사각형
        boolean[][] squares = new boolean[101][101];

        //색종이 갯수 입력
        int confettiCnt = Integer.parseInt(br.readLine());

        //전체 면적
        int totalArea = 0;
        
        //각 색종이 좌측하단 좌표값 저장
        for ( int i = 0; i < confettiCnt; i++ ) {

            String[] inputSquare = br.readLine().split(" ");
            int xPosition = Integer.parseInt(inputSquare[0]);
            int yPosition = Integer.parseInt(inputSquare[1]);

            for ( int x = xPosition; x < xPosition+10; x++ ) {
                for ( int y = yPosition; y < yPosition+10; y++) {
                    squares[y][x] = true;
                }
            }
        }

        for ( int i = 0; i < 100; i++ ) {
            for ( int j = 0 ; j < 100; j++ ) {
                if (squares[i][j] == true) {
                    totalArea += 1;
                }
            }
        }
        
        br.close();
        System.out.println(totalArea);
    }	
}
