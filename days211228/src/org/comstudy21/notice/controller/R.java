package org.comstudy21.notice.controller;

import org.comstudy21.notice.model.NoticeVo;
import org.comstudy21.notice.view.InsertView;
import org.comstudy21.notice.view.MenuView;
import org.comstudy21.notice.view.NoticeDelete;
import org.comstudy21.notice.view.NoticeDetail;
import org.comstudy21.notice.view.NoticeEdit;
import org.comstudy21.notice.view.NoticeListView;
import org.comstudy21.notice.view.NoticeView;
import org.comstudy21.notice.view.SearchByname;

public class R {
	public static int no;
	public static NoticeVo noticeVo;
	public static NoticeVo[] noticeArr;
	
	public static final int SEARCH=0, DEDAIL = 1;
	public static int type = 0;
	
	//public static final NoticeView searchByname = new SearchByName();
	public static final NoticeView menuView = new MenuView();
	public static final NoticeController noticeController = new NoticeController();
	
	public static final NoticeView noticeListView = new NoticeListView();
	public static final NoticeView insertView = new InsertView();
	public static final NoticeView searchByname = new SearchByname();
	public static final NoticeView noticeDetail = new NoticeDetail();
	public static final NoticeView noticeEdit = new NoticeEdit();
	public static final NoticeView noticeDelete = new NoticeDelete();
}
