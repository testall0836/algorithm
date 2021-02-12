package algorithm.step12.q11650;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 좌표 정렬하기
 * 
 * 시간 제한	- 1 초 
 * 메모리 제한	- 256 MB
 * 
 * 소요 시간	- 756 ms 
 * 소요 메모리	- 58992 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 12
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());	// 입력 좌표 개수
		List<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		for (int i = 0; i < inputCnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Coordinate c = new Coordinate();
			c.setX(Integer.parseInt(st.nextToken()));
			c.setY(Integer.parseInt(st.nextToken()));
			
			coordinates.add(c);
		}
		
		Collections.sort(coordinates, new Comparator<Coordinate>() {
			@Override
			public int compare(Coordinate o1, Coordinate o2) {
				if (o1.getX() > o2.getX()) {
					return 1;
				} else if (o1.getX() == o2.getX()) {
					if (o1.getY() > o2.getY()) {
						return 1;
					}
				}
				return -1;
			}
		});
		
		for (int i = 0; i < coordinates.size(); i++) {
			bw.write(coordinates.get(i).getX() + " " + coordinates.get(i).getY());
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
class Coordinate {
	int x;
	int y;
	
	public Coordinate() {
		// TODO Auto-generated constructor stub
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
