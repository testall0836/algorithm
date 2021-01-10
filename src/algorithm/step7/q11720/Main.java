package algorithm.step7.q11720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			String str = br.readLine();
			
			for (int i=0; i<str.length(); i++) {
				sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
			}
			
			bw.write(String.valueOf(sum));
			
			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}