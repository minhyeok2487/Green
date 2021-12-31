package mh.comstudy.StringClass;

import java.util.HashSet;
import java.util.Random;

public class Ch05Ex02 {

	// 자주 사용하는 컬렉션
	// set, map, list
	// Set - key도 없고 index도 없다. 순서가 없고 중복된 데이터 저장 안됨
	// Map = 요소를 key와 value를 쌍으로 갖는다.
	// List = index가 있다.
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();
		System.out.println("size => " + lotto.size());
		while(lotto.size() < 6) {
			int num = rand.nextInt(45);
			lotto.add(1+num);
			//System.out.printf("%d, %d\n",num,lotto.size());
		}
		System.out.println(lotto);
	}

}
