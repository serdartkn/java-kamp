import business.concretes.InstructorManager;
import business.concretes.StudentManager;
import entities.concretes.Instructor;
import entities.concretes.Student;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Serdar", "Tekin", "tekin@gmail.com", "1");		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "Yazılım");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		

	}

}
