package designPattern.creational.abstractFactory;

public class AnimalFactory implements AnimalAbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {
		if ("Dog".equalsIgnoreCase(animalType)) {

		} else if ("Duck".equalsIgnoreCase(animalType)) {
			return new Duck();
		}
		return null;
	}

}
