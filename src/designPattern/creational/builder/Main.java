package designPattern.creational.builder;

public class Main {
	public static void main(String[] args) {
		StudentBuilder builder = new StudentBuilder();
		
		Student student = builder
				.setName("Tester")
				.setStudentNumber(123123)
				.build();
		
		System.out.println(student.toString());
	}
}
