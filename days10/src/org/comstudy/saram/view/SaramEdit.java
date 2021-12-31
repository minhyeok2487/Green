package org.comstudy.saram.view;

import org.comstudy.saram.R;
import org.comstudy.saram.model.SaramVo;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: 사람 정보 수정 :::::");
		if(R.saramVo == null) {
			System.out.println("검색 결과 없습니다");
			return;
		}
		System.out.println(R.saramVo);
		System.out.print("새이름 >> ");
		R.saramVo.setName(scan.next());
		System.out.print("새 연락처 >> ");
		R.saramVo.setPhone(scan.next());
		System.out.print("새 이메일 >> ");
		R.saramVo.setEmail(scan.next());
			
	}
}
