package designPattern.creational.factoryMethod;

public class PizzaSeongnamStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new PizzaSeongnamStyle();
		}
		return pizza;
	}

}
