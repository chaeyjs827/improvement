package utility.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest1 {

	public static void main(String[] args) {
		int[] arr = {1, 1, 10, 30, 2};
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		// Stream을 쓰지 않았을 경우
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		Iterator<Integer> iter = set.iterator();	// set을 iterator 안에 담기
		
		for(int i =0; iter.hasNext(); i++) {
			list.add(iter.next());
		}
		
		list.sort(Comparator.reverseOrder());
		
		System.out.println("normal : " + list.toString());
		
		System.out.println("stream : " + 
				Arrays.stream(arr).boxed()	// Stream 생성
				.distinct()	// 중복제거
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()));
	}

}
