package utility.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("Alvaro", 30),
				new Student("Leonardo", 20),
				new Student("Federico", 10)
		);
		
		Map<String, Student> map = list.stream()
				.collect(Collectors.toMap(Student::getName, Function.identity()));

		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> System.out.println("이름 : " + s.getName()));
		
//		stream.forEach(System.out::println);
	}
}
