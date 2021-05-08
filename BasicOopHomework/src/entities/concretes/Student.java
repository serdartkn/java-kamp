package entities.concretes;

public class Student extends User {
	
	private String grade;	
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String eMailString,String grade) {
		super(id, firstName, lastName, eMailString);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
