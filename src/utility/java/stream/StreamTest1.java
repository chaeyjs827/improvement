package utility.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 10, 30, 2 };
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		// Stream을 쓰지 않았을 경우
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		Iterator<Integer> iter = set.iterator(); // set을 iterator 안에 담기

		for (int i = 0; iter.hasNext(); i++) {
			list.add(iter.next());
		}

		list.sort(Comparator.reverseOrder());

		System.out.println("normal : " + list.toString());

		System.out.println("stream : " + Arrays.stream(arr).boxed() // Stream 생성
				.distinct() // 중복제거
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	
		List<Integer> list2 = Arrays.asList(1, 3, 4, 6);
		Iterator<Integer> iter2 = list2.iterator();
		while (iter2.hasNext()) {
			int num = iter2.next();
			System.out.println("값 : " + num);
		}

		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(num -> System.out.println("Stream->값 : " + num));
	}

}
