package org.comstudy21.notice.model;

public class NoticeDao {
	public static final int MAX = 100;
	private static final NoticeVo[] noticeArr = new NoticeVo[MAX];
	private static int top = 0;
	private static int noticeSeq = 1;
	
	static {
		noticeArr[top++] = new NoticeVo(noticeSeq++, "민혁", "첫번째 메세지 입니다", "2021-09-09");
		noticeArr[top++] = new NoticeVo(noticeSeq++, "민정", "두번째 메세지 입니다", "2021-10-10");
		noticeArr[top++] = new NoticeVo(noticeSeq++, "현민", "세번째 메세지 입니다", "2021-11-11");
	}
	// selectAll, selectOne, selectByNo, update, delete, insert 구현
	
	public NoticeVo[] selectAll() {
		NoticeVo[] newArr = new NoticeVo[top];
		for(int i=0; i<newArr.length; i++) {
			NoticeVo newNotice = new NoticeVo();
			newNotice.setNo(noticeArr[i].getNo());
			newNotice.setUser(noticeArr[i].getUser());
			newNotice.setMessage(noticeArr[i].getMessage());
			newNotice.setRegDate(noticeArr[i].getRegDate());
			newArr[i] = newNotice;
		}
		return newArr;
	}
	
	public NoticeVo selectOne(NoticeVo vo) {
		for(int i=0; i<top; i++) {
			if(vo.getUser().equals(noticeArr[i].getUser())) {
				NoticeVo newSaram = new NoticeVo();
				newSaram.setNo(noticeArr[i].getNo());
				newSaram.setUser(noticeArr[i].getUser());
				newSaram.setMessage(noticeArr[i].getMessage());
				newSaram.setRegDate(noticeArr[i].getRegDate());
				return newSaram;
			}
		}
		return null;
	}
	
	public void insert(NoticeVo vo) {
		if(top >= MAX) {
			System.out.println(">>> 더이상 입력 불가능!");
			return;
		}
		vo.setNo(noticeSeq++);
		noticeArr[top++] = vo;
	}
	
	public void update(NoticeVo vo) {
		if(vo == null) return;
		for(int i=0; i<top; i++) {
			if(noticeArr[i].getNo() == vo.getNo()) {
				noticeArr[i] = vo;
			}
		}
	}
	public void delete(NoticeVo vo) {
		for(int i=0; i<top; i++) {
			if(noticeArr[i].getNo() == vo.getNo()) {
				for(int j=i; j<top-1; j++) {
					noticeArr[j] = noticeArr[j+1];
				}
				noticeArr[top-1] = null;
				top--;
			}
		}
	}
}
