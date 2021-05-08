package entities.concretes;

public class Instructor extends User{	

	private String branch;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String eMailString, String branch ) {
		super(id, firstName, lastName, eMailString);
		this.branch = branch;		
	}	
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
