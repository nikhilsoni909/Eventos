package eventos.services;


import java.sql.Date;

import eventos.models.Customers;

public interface CustomerDAOInterface {


	public String registerUser(String customerName,String customerMobileNumber,String customerEmail,Date customerDob,String customerPasswordHash,String customerPasswordSalt);

	public String registerUser(Customers user);

	public boolean isRegistered(String emailId);

	public String isValidCredential(String emailId, String password);

	public String getCustomerName(String emailId);
	public int getCustomerId(String emailId);
	
}