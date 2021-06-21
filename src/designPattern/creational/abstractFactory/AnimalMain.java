package designPattern.creational.abstractFactory;

public class AnimalMain {

	public static void main(String[] args) {
	
		AnimalFactory af = new AnimalFactory();
		Animal animal = af.create("duck");
		System.out.println(animal.getAnimal());
		System.out.println(animal.makeSound());
	
	}

}
