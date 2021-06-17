package designPattern.structual.decorator;

public class BioMain {

	public static void main(String[] args) {
		BioComponent bc = new BioBaseComponent();
		System.out.println(bc.attack());
		
		BioComponent bc2 = new BioMarineDecorator(bc);
		System.out.println(bc2.attack());
		
		BioComponent bc3 = new BioFirebatDecorator(bc);
		System.out.println(bc3.attack());
	}

}
