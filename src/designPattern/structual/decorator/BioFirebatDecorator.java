package designPattern.structual.decorator;

public class BioFirebatDecorator extends BioDecorator {

	public BioFirebatDecorator(BioComponent bioComponent) {
		super(bioComponent);
	}
	
	@Override
	public String attack() {
		return super.attack() + " FB option";
	}

}
