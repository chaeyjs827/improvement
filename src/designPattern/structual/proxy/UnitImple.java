package designPattern.structual.proxy;

public class UnitImple implements Unit{
	// 실제 Unit의 구현체
	@Override
	public void move() {
		System.out.println("Unit is moving");
	}

}
