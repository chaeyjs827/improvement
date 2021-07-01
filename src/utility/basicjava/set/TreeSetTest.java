package utility.basicjava.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	/*
	 * 데이터가 정렬된 상태로 저장되는 이진 검색 트리(binary search tree)의 형태로 요소를 저장함 데이터를 추가 삭제 등 기본
	 * 동작은 시간이 매우 빠르다. TreeSet implements Red-Black Tree 임 물론 set이기 때문에 요소의 순서에 상관없이
	 * 저장하고 중복을 허용하지 않음
	 */

	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);

		// printing - enhanced for
		for (Integer i : ts) {
			System.out.println(i);
		}

		// remove
		ts.remove(10);

		// printing - iterator
		Iterator<Integer> iter = ts.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}

	}

}
