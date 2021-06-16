package designPattern.structual.proxy;

public class ExpensiveObjectMain {

	public static void main(String[] args) {
		ExpensiveObject object = new ExpensiveObjectProxy();
		object.process();
	}

}
