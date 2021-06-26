package utility.java.stream;

import java.util.Arrays;

/*
 * 람다식 : 식별자 없이 실행 가능한 함수, 메소드를 하나의 간결학 식(expression)으로 표현한 것
 * 함수형 패러다임 : 주어진 데이터를 값으로 간주하고 새로운 값을 생성하는 함수에 초점을 맞춤
 * 			-> 메모리 관리에 대한 부담을 제거한다.
 * 
 * 
 * 
 * 			람다식 문법
 * 			(매개변수 목록) -> {실행문}
 */

public class LamdaTest {
		
	public static void main(String[] args) {
	
		// 람다식으로 표현
		int[] lamdaArr = new int[5];
		Arrays.setAll(lamdaArr, (i) -> (int) (Math.random() * 5) +1);
	}
	
	public static int getRandomNum() {
		return (int) (Math.random() * 5) + 1;
	}
	
	
}
