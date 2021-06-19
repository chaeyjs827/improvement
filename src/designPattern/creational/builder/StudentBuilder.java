package designPattern.creational.builder;

public class StudentBuilder {
	private Integer studentNumber;
	private String name;

	public StudentBuilder setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
		return this;
	}

	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public Student build() {
		return new Student(studentNumber, name);
	}
}
