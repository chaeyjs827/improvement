package utility.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		// LinkedList 초기화
		List<String> list = new LinkedList<>();
		
		// LinkedList 데이터 입력
		list.add("seongnam");
		list.add("Seo");
		list.add("Joo");
		list.add("Mul");
		
		// 데이터 삭제 by Index
//		list.remove(1);
		
		// 데이터 삭제 by Value
//		list.remove("seongnam");
		
		// 데이터 수정
		list.set(0, "FC");
		
		// LinkedList 데이터 출력
		for(String str : list) {
			System.out.println(str);
		}
		
		
	}

}
