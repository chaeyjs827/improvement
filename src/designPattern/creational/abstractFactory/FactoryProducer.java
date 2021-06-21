package designPattern.creational.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new RoundedFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
