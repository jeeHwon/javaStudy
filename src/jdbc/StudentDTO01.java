package jdbc;

public class StudentDTO01 {
	//field
	private String name;		//학생이름
	private String department;  //학과
	private String id;			//학번
	private double grade;		//학점평균
	
	//constructor
	public StudentDTO01(String name, String dept, String id, double gr) {
		this.name = name;
		this.department = dept;
		this.id = id;
		this.grade = gr;
	}

	//method : setter & getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() { //객체 생성 확인용 오버라이딩
		return "이름:"+name+"\n학과:"+department+"\n학번:"+id+"\n학점평균:"+grade;
	}
}
