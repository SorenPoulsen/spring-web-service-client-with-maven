package com.sorenpoulsen.serviceclient;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sorenpoulsen.enterprisemodel.Customer;
import com.sorenpoulsen.ws.CustomerServiceClient;
import com.sorenpoulsen.ws.CustomerServiceConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CustomerServiceConfiguration.class })
public class CustomerServiceTest {

	String mockEndpoint;

	@Autowired
	CustomerServiceClient customerServiceClient;

	@Before
	public void readMockPort() {
		Properties p = new Properties();
		try (InputStream is = CustomerServiceTest.class.getResourceAsStream("/test.properties")) {
			p.load(is);
		} catch (IOException e) {
			Assert.fail();
		}
		String mockport = p.getProperty("mockport");
		Assert.assertNotNull(mockport);
		mockEndpoint = "http://localhost:" + mockport + "/customerservice";
	}

	@Test
	public void testCustomerServiceClient() {
		customerServiceClient.setDefaultUri(mockEndpoint);
		Customer customer = customerServiceClient.getCustomer("1");
		Assert.assertNotNull(customer);
		Assert.assertEquals("Orisa", customer.getName());
	}
}
