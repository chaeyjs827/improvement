package designPattern.structual.decorator;

public class BioBaseComponent implements BioComponent{
	
	/*
	 * 2. 생성된 인터페이스를 implements해서 추상 메소드를 구현한다.
	 * 그다음 Decorator 객체를 생성 해야한다.
	 * -> 3.BioDecorator.java
	 */
	
	@Override
	public String attack() {
		return "attack";
	}

}
