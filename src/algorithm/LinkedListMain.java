package algorithm;

public class LinkedListMain {
	/*
	 * https://opentutorials.org/module/1335/8857
	 */
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(21);
		list.addFirst(30);
		list.addFirst(90);
		list.addFirst(30);
		list.addFirst(21);
		list.addFirst(30);
		list.addFirst(90);
		list.addFirst(90);
		list.addFirst(21);
 		list.addFirst(90);
 		list.addFirst(10);

		list.removeDuplicatedNode();
		System.out.println(list);
		System.out.println("size : " + list.size());
	}
}

class LinkedList {
	private Node head; // 첫 번째 노드의 값
	private Node tail; // 마지막 노드의 값
	private int size = 0;

	// 하나의 엘리먼트는 하나의 객체
	private class Node {
		private Object data; // 데이터가 저장될 필드들
		private Node next; // 다음 노드를 가르키는 필드

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) { // 처음 생성된 노드는 next가 없음
			tail = head;
		}
	}

	public void removeDuplicatedNode() {
		if (size <= 1) {
			return;
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				Node temp1 = getNode(i);
				Node temp2 = getNode(j);
				if(i==j) {
					continue;
				}
				if (temp1.data.equals(temp2.data)) {
					remove(j);
				}
			}
		}
		
	}

	public void remove(int index) {
		if (index == 0) {
			removeFirst();
			return;
		}
		Node temp = getNode(index - 1);
		Node todoDeleted = temp.next; // 나중에 삭제를 위해 잠시 저장
		temp.next = temp.next.next; // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드
		if (todoDeleted == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size--;
	}

	public void removeFirst() {
		Node temp = head;
		head = temp.next;
		temp = null;
		size--;
	}

	public Node getNode(int index) {
		Node temp = head; // 첫 검색의 기준은 첫 데이터가 좋음
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public int size() {
		return size;
	}

	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.data + ",";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
}