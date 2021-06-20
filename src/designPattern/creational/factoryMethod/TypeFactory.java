package designPattern.creational.factoryMethod;

public class TypeFactory {
	
	public Type createType(String type) {
		Type returnType = null;
		
		if(type.equals("A")) {
			returnType = new TypeA();
		} else if(type.equals("B")) {
			returnType = new TypeB();
		} else if(type.equals("C")) {
			returnType = new TypeC();
		}
		
		return returnType;
	}
}
