package designPattern.creational.abstractFactory;

public class Duck implements Animal {

	@Override
	public String getAnimal() {
		return "duck";
	}

	@Override
	public String makeSound() {
		return "kwak";
	}

}
