package designPattern.structual.proxy;

public class ProxyPatternMain {

	/*
	 * 실제 객체를 바로 이용하는 것 대신 가상 객체에 실제 객체를 선언하여 실제 객체의 기능과 추가적인 기능을 사용함으로써 기능의 흐름을 제어
	 */
	
	public static void main(String[] args) {
		ProxyMailSender pms = new ProxyMailSender();
		pms.send("hmm...", "NAVER");
	}

}
