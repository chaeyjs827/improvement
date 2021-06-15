package designPattern.structual.proxy;

import java.util.Objects;

public class ProxyMailSender implements MailSender{

	private MailSender mailSender;
	
	@Override
	public void send(String message, String type) {
		
		if(type.equals("KAKAO")) {
			mailSender = new KakaoMailSender();
		} else if(type.equals("NAVER")) {
			mailSender = new NaverMailSender();
		}
		
		System.out.println("proxy before process");
		mailSender.send(message, type);
		System.err.println("Proxy after process");
		
	}

}
