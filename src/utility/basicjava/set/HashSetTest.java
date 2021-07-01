package utility.basicjava.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	/*
	 * Set은 순서가 없는 데이터의 집합으로, 데이터의 중복을 허용하지 않는다.
	 * 
	 * HashSet은 해시 알고리즘(hash algorithm)을 사용하여 검색 속도가 매우 빠르다.
	 * HashSet 클래스는 내부적으로 HashMap 인스턴스를 이용하여 요소를 저장함
	 * 
	 * HashSet 클래스는 Set 인터페이스를 구현하므로, 요소를 순서에 상관없이 저장하고 중복된 값은 저장하지 않음.
	 * 하지만 저장 순서를 유지해야 한다면 JDK 1.4 부터 제공하는 LinkedHashSet 클래스를 사용하면 된다.
	 * 
	 */
	
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		
		hs1.add("Alessandro");
		hs1.add("Gianluigi");
		
		System.out.println(hs1.add("Alessandro"));	// 중복된 값을 add false가 리턴
		System.out.println(hs1.add("Vincenzo"));	// 중복되지 않은 값을 add true가 리턴
		
		// printing - enhanced for
		for(String s : hs1) {
			System.out.println(s);
		}
		
		hs2.add("Mauro");
		hs2.add("Pavel");
		hs2.add("Giorgio");
		
		// printing - iterator
		Iterator<String> iter = hs2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
