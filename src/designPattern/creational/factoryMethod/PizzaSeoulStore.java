package designPattern.creational.factoryMethod;

public class PizzaSeoulStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new PizzaSeoulStyle();
		}
		return pizza;
	}

}
