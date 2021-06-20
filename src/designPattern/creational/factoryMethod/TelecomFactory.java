package designPattern.creational.factoryMethod;

public class TelecomFactory {
	
	/*
	 * Factory Method Pattern은 분기에 따른 객체 생성을 직접하지 않고, 팩토리 클래스에 위임하는것
	 * 팩토리 객체 내에서 분기처리하며 초기화 되는 부분을 외부에서 확인 할 수 없게함.
	 * 
	 */
	
	public TelecomStore createTelecomStore(String telecomName) {
		TelecomStore telecomStore = null;
		if (telecomName.equals("SK")) {
			telecomStore = new TelecomSK();
		} else if (telecomName.equals("Uplus")) {
			telecomStore = new TelecomUplus();
		}
		return telecomStore;
	}
}
