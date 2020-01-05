package jac.assign1.model;
import java.util.List;

public class Teacher {
	
	private String name;
	private List<Student> studentList;

	
	// Constructor
	public Teacher() {
	}
	
	public Teacher(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}

	public Teacher(String name, List<Student> studentList) {
		super();
		this.name = name;
		this.studentList = studentList;
	}

	// Methods
	@Override
	public String toString() {
		String output = "Teacher's Name: " + this.name
				+ "\nList of Students:\n";
		
		for (Student st : studentList) {
			output += "ID: " + st.getStdId() + "\tName: " + st.getStdName() + "\n";
		}
		
		return output;
	}
	
}
