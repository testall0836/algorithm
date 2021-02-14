package algorithm.step12.q10814;

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
 * 나이순 정렬
 * 
 * 시간 제한	- 3 초 
 * 메모리 제한	- 256 MB
 * 
 * 소요 시간	- 616 ms 
 * 소요 메모리	- 55504 KB
 * 
 * @author	testall0836
 * @date	2021. 2. 14
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCnt = Integer.parseInt(br.readLine());
		List<Member> memList = new ArrayList<Member>();
		
		for (int i = 0; i < inputCnt; i++) {
			Member m = new Member();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			m.setAge(age);
			m.setName(name);
			
			memList.add(m);
		}
		
		Collections.sort(memList, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				
				if (o1.getAge() > o2.getAge()) {
					return 1;
				} else if (o1.getAge() == o2.getAge()) {
					return 0;
				}
				return -1;
			}
		});
		
		for (int i = 0; i < memList.size(); i++) {
			bw.write(memList.get(i).getAge() + " " + memList.get(i).getName() + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

class Member {
	int age;
	String name;
	public Member() {
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
