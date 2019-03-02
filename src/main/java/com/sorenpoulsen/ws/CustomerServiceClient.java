package com.sorenpoulsen.ws;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.sorenpoulsen.enterprisemodel.Customer;
import com.sorenpoulsen.enterprisemodel.GetCustomer;
import com.sorenpoulsen.enterprisemodel.GetCustomerResponse;

public class CustomerServiceClient extends WebServiceGatewaySupport {
	
	public Customer getCustomer(String customerID) {
		GetCustomer getCustomer = new GetCustomer();
		getCustomer.setCustomerID(customerID);
		GetCustomerResponse response = (GetCustomerResponse)getWebServiceTemplate().marshalSendAndReceive(getCustomer);
		return response.getCustomer();
	}
}
