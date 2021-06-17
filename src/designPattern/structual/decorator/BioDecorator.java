package designPattern.structual.decorator;

public class BioDecorator implements BioComponent {

	private BioComponent bioComponent;
	
	public BioDecorator(BioComponent bioComponent) {
		this.bioComponent = bioComponent;
	}
	
	@Override
	public String attack() {
		return bioComponent.attack();
	}

}
