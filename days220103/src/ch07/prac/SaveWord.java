package ch07.prac;

import java.util.Vector;

public class SaveWord {
	public static void insert(Vector<Word> v) {
		v.add(new Word("persimmon", "감"));
		v.add(new Word("potato", "감자"));
		v.add(new Word("sesame", "깨"));
		v.add(new Word("garlic", "마늘"));
		v.add(new Word("strawberry", "딸기"));
		v.add(new Word("parsley", "미나리"));
		v.add(new Word("mango", "망고"));
		v.add(new Word("seaweed", "미역"));
		v.add(new Word("spinach", "시금치"));
		v.add(new Word("pear", "밤"));
		v.add(new Word("cabbage", "양배추"));
		v.add(new Word("lettuce", "상추"));
		v.add(new Word("peach", "복숭아"));
		v.add(new Word("onion", "양파"));
		v.add(new Word("cucumber", "오이"));
		v.add(new Word("ginger", "생강"));
		v.add(new Word("pimiento", "피망"));
		v.add(new Word("pomegranate", "석류"));
		System.out.printf("현재 %d개의 단어가 들어 있습니다.\n", v.size());
	}
}
