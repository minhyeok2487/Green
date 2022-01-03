package ch07.ex01;

import java.util.Vector;

abstract class Ex {
	public abstract void run();
}


class Ex01 extends Ex {
	@Override
	public void run() {
		System.out.println("정수 값만 다루는 제네릭 벡터 생성");
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("v.size() => "+v.size());
		System.out.println("v.capacity() =>"+v.capacity());
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		System.out.println();
		System.out.println("add 후 v.size() => "+v.size());
		
		System.out.println(v);
		for(Integer i : v) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i=0; i< v.size();i++) {
			sum += v.elementAt(i);
		}
		System.out.println("Sum => "+sum);
	}
}

public class Ch07Ex01VectorEx {

	public Ch07Ex01VectorEx() {
		// 생성자는 필드를 초기화한다.
		// 예제 구현 메소드 별도로 만든다.
		Ex ex01 = new Ex01();
		ex01.run();
	}
	
	public static void main(String[] args) {
		//생성자에서 시작하도록 한다.
		new Ch07Ex01VectorEx();
	}

}
