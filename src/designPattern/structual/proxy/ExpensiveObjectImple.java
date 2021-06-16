package designPattern.structual.proxy;

public class ExpensiveObjectImple implements ExpensiveObject{

	public ExpensiveObjectImple() {
		heavyInitialConfiguration();
	}
	
	@Override
	public void process() {
		System.out.println("processing complete");
	}

	private void heavyInitialConfiguration() {
		System.out.println("이 부분엔 실제로 과부하가 일어날 수 있는 로직이 포함됨");
	}
}
