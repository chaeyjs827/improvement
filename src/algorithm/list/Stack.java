package algorithm.list;

public class Stack {
	
	private int top;
	private int maxSize;
	private int[] stackArray;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new int[maxSize];
		this.top = -1;	// 초기 값은 -1
	}
	
	// 데이터 추가
	public void push(int value) {
		if(!full()) {
			stackArray[++top] = value; // 전위 증가로 첫 번쨰 push때 인덱스0에 첫번쨰 값이 추가됨
			System.out.println(value + " push! (index:" + top + "/" + "value:" + value + ")");
		}
	}
	
	// 마지막으로 추가된 데이터 삭제
	public void pop() {
			stackArray[top--] = 0;
			System.out.println("pop!");
	}

	// 마지막으로 추가된 데이터 조회
	public void peek() {
		System.out.println("마지막 입력 값 : " + stackArray[top]);
	}
	
	// 스택 비었는지 확인, true=비었음/false=데이터 존재
	public boolean empty() {
		System.out.println("isEmpty : " + (top == -1));
		return(top == -1);
	}
	
	// 스택이 꽉 찼는지 확인
	public boolean full() {
		System.out.println("isFull : " + ((top+1) == maxSize));
		return ((top+1) == maxSize);
	}
	
	// 값 인덱스 검색
	public void search(int value) {
		if(!empty()) {
			for(int i=0; i<stackArray.length; i++) {
				if(stackArray[i] == value) {
					System.out.println(value + "의 인덱스는 " + i + " 입니다.");
				}
			}
		}
	}
}
