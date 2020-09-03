package io.ennate.complex.email;

import org.springframework.stereotype.Component;

@Component
public interface EmailService {
	 void sendEmail(String toAddress, String body);
}
