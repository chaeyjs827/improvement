package utility.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	/*
	 * ArrayList는 배열을 이용하기 때문에 인덱스를 이용하여 배열 요소에 빠르게 접근 할 수 있음
	 */
	
	public static void main(String[] args) {
		// ArrayList 초기화
		List<String> list = new ArrayList<>();
		
		// 데이터 입력
		list.add("Today");
		list.add("is");
		list.add("too");
		list.add("hot");
		
		// 요소 제거 by Index
		//list.remove(0);

		// 요소 제거 by value
		//list.remove("is");

		// 요소 수정
		list.set(0, "Yesterday");
		
		// 요소 출력
		System.out.println("===list===");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("size : " + list.size());
		
		// ArrayList 확장 방법
		// 1. 생성자에 매개변수로 추가
		List<String> list2 = new ArrayList<>(list);
		// 2. addAll로 추가
		list2.addAll(list);
		System.out.println("===list2===");
		for(String str : list2) {
			System.out.println(str);
		}
		System.out.println("list2 size : " + list2.size());
	}

}
