package jdbc;

import java.util.Date;

//DTO(Data Transfer Object)
//데이터를 object로 변환하는 객체
//일반적으로 로직을 갖고 있지 않은 순수한 데이터 객체
//필드, 그 필드에 접근하기 위한 get&set 메소드만 가진 클래스
public class MemberDTO {
	//field : [접근제어자][속성]데이터타입 변수명 [=초기값];
	private int mNo; //회원번호
	private String mName; //이름
	private String mId; //id
	private String mPw; //비번
	private Date mDate; //회원가입일
	
	//constructor : [접근제어자] 클래스명(){}
	public MemberDTO() {}
	public MemberDTO(String mName,String mId,String mPw) {
		this.mName = mName; 
		this.mId = mId; 
		this.mPw = mPw; 
	}
	public MemberDTO(int mNo, String mName,String mId,String mPw,Date mDate) {
		this.mNo = mNo; 
		this.mName = mName; 
		this.mId = mId; 
		this.mPw = mPw; 
		this.mDate = mDate;
	}
	
	
	//method : [접근제어자][속성]리턴유형 메서드명(){}
	//getter & setter
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPw() {
		return mPw;
	}
	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
	@Override
	public String toString() {
		return "MemberDTO [mNo=" + mNo + ", mName=" + mName + ", mId=" + mId + ", mPw=" + mPw + ", mDate=" + mDate
				+ "]";
	}
	
}
