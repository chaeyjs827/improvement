package designPattern.structual.proxy;

public class UnitMain {

	public static void main(String[] args) {
		Unit unit1 = new UnitProxy();
		unit1.move();
	}

}
