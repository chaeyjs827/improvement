package utility.java.synchronizedTest;

public class SynchronizedTest {

	/*
	 * increMethod에 synchronized를 설정하지 않으면 2개 이상의 사용되는 스레드가 동시에 접근함
	 * 하지만 동기화 설정을 하면 해당 자원에 2개 이상의 스레드가 접근 할 수 없음
	 * 
	 * 해당 예제는 synchronized를 설정 하지 않으면 한 번에 스레드 2개 모두 increMethod에 접근 하지만
	 * 동기화 설정을 하면 순서에 맞게 1개씩 사용됨
	 * 
	 */
	
	public static void main(String[] args) {
		MethodClass mc = new MethodClass();
		
		ThreadClass tc1 = new ThreadClass(mc, 3);
		ThreadClass tc2 = new ThreadClass(mc, 7);
		tc1.start();
		tc2.start();
	}
}

class ThreadClass extends Thread {
	MethodClass mc;
	int i;
	
	public ThreadClass(MethodClass mc, int i) {
		this.mc = mc;
		this.i = i;
	}
	
	public void run() {
		mc.increMethod(i);
	}
}

class MethodClass {
	public synchronized void increMethod(int i) {
		for (int j = 0; j < 5; j++) {
			System.out.println(j * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {

			}
		}
	}
//	public synchronized void increMethod(int i) {
//		for (int j = 0; j < 5; j++) {
//			System.out.println(j * i);
//			try {
//				Thread.sleep(400);
//			} catch (Exception e) {
//				
//			}
//		}
//	}
}