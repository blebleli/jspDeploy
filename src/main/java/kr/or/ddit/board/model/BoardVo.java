package kr.or.ddit.board.model;

import java.util.Date;

public class BoardVo {
	private String title;			//글 제목
	private String content;			//글 내용
	private String userId;			//글 작성자 아이디
	private String alias;			//작성자 별칭
	private Date redDt;				//글 등록일시
	

	public BoardVo() {}				//기본생성자
	
	public BoardVo(String title, String content, String userId, String alias, Date redDt) {
		this.title = title;
		this.content = content;
		this.userId = userId;
		this.alias = alias;
		this.redDt = redDt;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Date getRedDt() {
		return redDt;
	}
	public void setRedDt(Date redDt) {
		this.redDt = redDt;
	}
	@Override
	public String toString() {
		return "BoardVo [title=" + title + ", content=" + content + ", userId="
				+ userId + ", alias=" + alias + ", redDt=" + redDt + "]";
	}
	
	
	
	
}
