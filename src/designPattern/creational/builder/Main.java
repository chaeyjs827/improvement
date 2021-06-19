package designPattern.creational.builder;

public class Main {
	public static void main(String[] args) {
		StudentBuilder builder = new StudentBuilder();
		
		Student student = builder
				.setName("Tester")
				.setStudentNumber(123123)
				.build();
		
		System.out.println(student.toString());
		
		TestBuilder testBuilder = new TestBuilder();
		
		TestObj testObj = testBuilder
					.setMessage("Ohhh HI")
					.build();
		
		System.out.println(testObj);
	}
}
