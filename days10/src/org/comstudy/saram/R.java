package org.comstudy.saram;

import org.comstudy.saram.controller.SaramController;
import org.comstudy.saram.model.SaramVo;
import org.comstudy.saram.view.InsertView;
import org.comstudy.saram.view.MenuView;
import org.comstudy.saram.view.SaramDelete;
import org.comstudy.saram.view.SaramDetail;
import org.comstudy.saram.view.SaramEdit;
import org.comstudy.saram.view.SaramListView;
import org.comstudy.saram.view.SaramView;
import org.comstudy.saram.view.SearchByName;

public class R {
	public static int no;
	public static SaramVo saramVo;
	public static SaramVo[] saramArr;
	
	public static final int SEARCH=0, DEDAIL=1;
	public static int type = 0;
	
	public static final SaramView searchByname = new SearchByName();
	public static final SaramView menuView = new MenuView();
	
	public static final SaramView insertView = new InsertView();
	public static final SaramView saramDelete = new SaramDelete();
	public static final SaramView saramDetail = new SaramDetail();
	public static final SaramView saramEdit = new SaramEdit();
	public static final SaramView saramListView = new SaramListView();
	
	public static final SaramController saramController = new SaramController();
}