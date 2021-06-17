package designPattern.structual.decorator;

public class BioMarineDecorator extends BioDecorator {

	/*
	 * 4. Decorator를 상속받는 추가 기능 Decorator 파일을 생성한다.
	 * 
	 * 추가 기능 Decorator는 Decorator를 상속 받았기 때문에 생성자는 Decorator.super()를 사용
	 */
	
	public BioMarineDecorator(BioComponent bioComponent) {
		super(bioComponent);
	}

	@Override
	public String attack() {
		return super.attack() + " marine option";
	}

}
