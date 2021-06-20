package designPattern.creational.factoryMethod;

public class TypeMain {
	public static void main(String[] args) {
		TypeFactory typeFactory = new TypeFactory();
		typeFactory.createType("A");
		typeFactory.createType("B");
		typeFactory.createType("C");
	}
}
