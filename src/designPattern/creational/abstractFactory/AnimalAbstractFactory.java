package designPattern.creational.abstractFactory;

public interface AnimalAbstractFactory<T> {
	T create(String animalType);
}
 