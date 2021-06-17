package designPattern.structual.decorator;

public class BioMarineDecorator extends BioDecorator {

	public BioMarineDecorator(BioComponent bioComponent) {
		super(bioComponent);
	}

	@Override
	public String attack() {
		return super.attack() + " marine option";
	}

}
