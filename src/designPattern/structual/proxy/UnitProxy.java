package designPattern.structual.proxy;

public class UnitProxy implements Unit{

	private Unit unit;
	// 유닛의 프록시 객체로 스프링 AOP의 공통 모듈이 실제 처리되는 부분이기도함
	@Override
	public void move() {
		unit = new UnitImple();
		System.out.println("Unit is initialized");
		unit.move();
		System.out.println("Unit is closed");
	}

}
