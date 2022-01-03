package ch07.ex01;

import java.util.Iterator;
import java.util.Vector;

class Ex04 {
	public void run() {
		System.out.println("정수 값만 다루는 제네릭 벡터 생성");
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("v.size() => "+v.size());
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		System.out.println("add 후 v.size() => "+v.size());
		System.out.println();
		
		System.out.println("Iterator를 이용한 모든 정수 출력하기");
		Iterator<Integer> it = v.iterator(); 
		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n+ " ");
		}
		System.out.println("\nlterator를 이용하여 모든 정수 더하기");
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합: " + sum);
	}
}
public class Ch07Ex04IteratorEx {
	public static void main(String[] args) {
		Ex04 ex = new Ex04();
		ex.run();
	}

}
