package org.comstudy.saram.view;

import org.comstudy.saram.R;
import org.comstudy.saram.model.SaramVo;

public class SaramListView extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: 사람 목록 :::::");
		// R.saramArr 출력
		for(SaramVo saram : R.saramArr) {
			System.out.println(saram);
		}
	}
}
