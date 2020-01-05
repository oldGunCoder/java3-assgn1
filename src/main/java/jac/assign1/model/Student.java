package jac.assign1.model;

public class Student {
	
	private int stdId;
	private String stdName;

	// Constructor
	public Student() {
	}
	
	public Student(int stdId, String stdName) {
		this.stdId = stdId;
		this.stdName = stdName;
	}

	// Getters & Setters
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
}
