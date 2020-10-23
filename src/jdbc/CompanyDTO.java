package jdbc;

public class CompanyDTO {
	//field
	private int cno;
	private String cname;
	private String ceo;
	private String tel;
	private String dam;
	
	//constructor
	public CompanyDTO() {}
	public CompanyDTO(int cno, String cname, String ceo, String tel, String dam) {}

	
	//method(setter & getter)
	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDam() {
		return dam;
	}

	public void setDam(String dam) {
		this.dam = dam;
	}
	@Override
	public String toString() {
		return "CompanyDTO [cno=" + cno + ", cname=" + cname + ", ceo=" + ceo + ", tel=" + tel + ", dam=" + dam + "]";
	} 

	
	
}
