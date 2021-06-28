package utility.java.stream;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("DelPiero", 12),
				new Student("Gianluigi", 13),
				new Student("Alessandro", 14)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> System.out.println("이름: "+s.getName()));
	}

}

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
}
