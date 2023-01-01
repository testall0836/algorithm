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
 * 
 * @author testall0836
 * @date 2022. 12. 29
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //색종이 갯수 입력
        int paperCnt = Integer.parseInt(br.readLine());
        
        //중복영역이 계산되지 않은 색종이 넓이
        int paperArea = paperCnt * (10 * 10);

        //누적중복넓이
        int sumDupArea = 0;

        //중복넓이를 제외한 색종이 넓이
        int calPaperArea = 0;

        //사각형 좌표 저장을 위한 2차원 배열 선언
        int[][] squares = new int[paperCnt][2];
        
        //각 색종이 좌측하단 좌표값 저장
        for ( int i = 0; i < paperCnt; i++ ) {

            String[] inputSquare = br.readLine().split(" ");
            for ( int j = 0; j < 2; j++ ) {
                squares[i][j] = Integer.parseInt(inputSquare[j]);
            }
        }

        //배열 순차 방문, 해당 인덱스의 값을 자기 자신을 제외한 이후의 인덱스와 비교
        //
        for ( int x = 0; x < paperCnt; x++ ) {
            //두 인덱스의 좌표값(x, y)을 비교하여   (|x1 - x2| < 10) && (|y1 - y2| < 10) 인 경우 두 사각형은 중복영역이 존재
            //(10 - (|x1 - x2|)) * (10 - (|y1 - y2|)) 가 중복영역의 넓이
            for ( int y = x+1; y < paperCnt; y++ ) {

                int widthDiff = Math.abs(squares[x][0] - squares[y][0]);
                int heightDiff = Math.abs(squares[x][1] - squares[y][1]);

                if ( ( widthDiff < 10 ) && ( heightDiff < 10 ) ) {
                    sumDupArea += (10 - widthDiff) * (10 - heightDiff);
                } 
            }
        }
        calPaperArea = paperArea - sumDupArea;

        //색종이 전체 영역 - 색종이 중복 영역
        System.out.println(calPaperArea);

        br.close();
    }	
}
