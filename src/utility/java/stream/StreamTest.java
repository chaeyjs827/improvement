package utility.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c1");
		
		list
			.stream()
//			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		
		
	}

}
