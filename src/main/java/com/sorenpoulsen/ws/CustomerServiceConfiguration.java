package com.sorenpoulsen.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Configuration
public class CustomerServiceConfiguration {

	@Bean
	public SaajSoapMessageFactory messageFactory() {
		SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
		messageFactory.setSoapVersion(SoapVersion.SOAP_12);
		return messageFactory;
	}

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.sorenpoulsen.enterprisemodel");
		return marshaller;
	}

	@Bean
	public CustomerServiceClient customerServiceClient(Jaxb2Marshaller marshaller,
			SaajSoapMessageFactory messageFactory) {
		CustomerServiceClient customerServiceClient = new CustomerServiceClient();
		customerServiceClient.setMessageFactory(messageFactory);
		customerServiceClient.setMarshaller(marshaller);
		customerServiceClient.setUnmarshaller(marshaller);
		return customerServiceClient;
	}
}
