package io.ennate.complex.email;

import org.springframework.stereotype.Component;

@Component
public class AWSEamilService implements EmailService {
	public void AWSEamilServices() {
		System.out.println("Notif service constructor");
	}

	@Override
	public void sendEmail(String toAddress, String body) {
		// TODO Auto-generated method stub
		System.out.println("Sending" + toAddress);
		System.out.println("Body" + body);
	}
}
