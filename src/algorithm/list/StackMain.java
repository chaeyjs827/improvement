package algorithm.list;

import java.io.IOException;

public class StackMain {

	/*
	 * 1. 선형 구조 LIFO(Last In First Out, 후입선출)
	 * 2. push(입력), pop(출력)
	 * 3. 메모리 구조의 그 스택임
	 */
	
	public static void main(String[] args) throws IOException{
//		InputStreamReader inputStream = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(inputStream);
//		int size = br.readLine();
		
		int size = 5;
		Stack stack = new Stack(size);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.search(10);
		
		stack.peek();
	}

}