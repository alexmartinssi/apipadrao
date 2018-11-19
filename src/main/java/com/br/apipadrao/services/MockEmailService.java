package com.br.apipadrao.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService{

	private static final Logger log = LoggerFactory.getLogger(MockEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage email) {
		log.info("Simulando envio de email");
		log.info(email.toString());
		log.info("Email enviado");
		
	}

}
