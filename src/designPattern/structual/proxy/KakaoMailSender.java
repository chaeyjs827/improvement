package designPattern.structual.proxy;

public class KakaoMailSender implements MailSender{

	@Override
	public void send(String message, String type) {
		System.out.println("[SEND by KAKAO] : " + message);
	} 

}
