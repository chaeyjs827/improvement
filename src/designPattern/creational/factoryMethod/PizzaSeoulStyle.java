package designPattern.creational.factoryMethod;

public class PizzaSeoulStyle extends Pizza {
	public PizzaSeoulStyle() {
		name = "서울 피자";
		dough = "서울 씬 도우";
		sauce = "서울 소스";
		toppings.add("옥수수");
		toppings.add("체다 치즈");
	}
}
