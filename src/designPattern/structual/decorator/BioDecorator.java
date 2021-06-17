package designPattern.structual.decorator;

public class BioDecorator implements BioComponent {

	/*
	 * 3. Decorator 객체는 프록시 패턴의 Proxy 객체와 같다.
	 * 하지만 Proxy 구현 객체를 호출만 해서 사용 하는 개념이고,
	 * Decorator는 구현 객체에 새로운 기능을 추가 하기 위해 사용한다.
	 * 
	 * 우선 데코레이터 생성자는 인터페이스 구현체를 인자로 받아 생성되고
	 * 해당 인자로 구현된 추상 메소드를 실행함(여기까지는 프록시와 동일)
	 * 
	 * 그리고 추가 하고 싶은 기능을 구현하는 클래스를 생성함
	 * -> BioMarineDecorator.java / BioFirebatDecorator.java
	 * 
	 */
	
	private BioComponent bioComponent;
	
	public BioDecorator(BioComponent bioComponent) {
		this.bioComponent = bioComponent;
	}
	
	@Override
	public String attack() {
		return bioComponent.attack();
	}

}
