package designPattern.creational.builder;

public class Student {

	private Integer studentNumber;
	private String name;

	public Student(Integer studentNumber, String name) {
		this.studentNumber = studentNumber;
		this.name = name;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", name=" + name + "]";
	}
	
}
