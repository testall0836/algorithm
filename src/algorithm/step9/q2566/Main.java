package algorithm.step9.q2566;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 출처 : https://www.acmicpc.net/problem/2566
 * 
 * 시간 제한 : 1초
 * 메모리 제한 : 128 MB
 * 
 * 
 * @author testall0836
 * @date 2022. 12. 27
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //최대값 저장
        int maxNum = 0;
        int maxN = 0;
        int maxM = 0;

        String inputLine;
        
        for ( int i = 0; i < 9; i++ ) {
        	inputLine = br.readLine();
        	
        	String[] strArr = inputLine.split(" ");
        	
        	for ( int j = 0; j < strArr.length; j++ ) {
        		if ( Integer.parseInt(strArr[j]) >= maxNum ) {
        			maxNum = Integer.parseInt(strArr[j]);
        			//해당 행렬의 위치값 저장
        			maxN = i+1;
        			maxM = j+1;
        		}
        	}

        }

        bw.write(maxNum + "\n");
        bw.write(maxN + " " + maxM + "\n");

        bw.close();
    }	
}
