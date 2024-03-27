/**
 * Customers class to hold the customer details and methods to get and set the details of the customer.
 * 
 * @author Sumit Saini
 * @version 1.0
 * @since 10 March 2024
 * @lastUpdated 18 March 2024
 * @see java.sql.Date
 * 
 * Data Members:
 *     customerId: int
 *     customerName: String
 *     customerMobileNumber: String
 *     customerEmail: String
 *     customerDob: Date
 *     customerPasswordHash: String
 *     customerPasswordSalt: String
 *     
 * Methods:
 *    Customers(): void - Default constructor with no parameters
 *    Customers(String, String, String, Date, String, String): void - Constructor with all parameters except customerId
 *    Customers(int, String, String, String, Date, String, String): void - Constructor with all parameters
 *    getCustomerId(): int - Getter method for customerId
 *    setCustomerId(int): void - Setter method for customerId
 *    getCustomerName(): String - Getter method for customerName
 *    setCustomerName(String): void - Setter method for customerName
 *    getPassword(): String - Getter method for password
 *    setPassword(String): void - Setter method for password
 *    getCustomerMobileNumber(): String - Getter method for customerMobileNumber
 *    setCustomerMobileNumber(String): void - Setter method for customerMobileNumber
 *    getCustomerEmail(): String - Getter method for customerEmail
 *    setCustomerEmail(String): void - Setter method for customerEmail
 *    getCustomerDob(): Date - Getter method for customerDob
 *    setCustomerDob(Date): void - Setter method for customerDob
 *    getCustomerPassword(): String - Getter method for password
 *    setCustomerPassword(String): void - Setter method for password
 *    getCustomerPasswordHash(): String - Getter method for passwordHash
 *    setCustomerPasswordHash(String): void - Setter method for passwordHash
 *    getCustomerPasswordSalt(): String - Getter method for passwordSalt
 *    setCustomerPasswordSalt(String): void - Setter method for passwordSalt
 *    toString(): String - Method to return the string representation of the object
 *    
 * Dependencies:
 * 	  java.sql.Date
 *   
 * @category Models
 */

package eventos.models;

import java.sql.Date;

public class Customers {

	private int customerId;
    private String customerName;
    private String customerMobileNumber;
    private String customerEmail;
    private Date customerDob;
    private String customerPasswordHash;
    private String customerPasswordSalt;

    /**
     * Default constructor with no parameters
     */
    public Customers() {
		super();
	}

	/**
	 * Constructor with all parameters except customerId
	 * 
	 * @param customerName
	 * @param customerMobileNumber
	 * @param customerEmail
	 * @param customerDob
	 * @param customerPasswordHash
	 * @param customerPasswordSalt
	 */
    public Customers(String customerName, String customerMobileNumber, String customerEmail, Date customerDob,
			String customerPasswordHash, String customerPasswordSalt) {
		super();
		this.customerName = customerName;
		this.customerMobileNumber = customerMobileNumber;
		this.customerEmail = customerEmail;
		this.customerDob = customerDob;
		this.customerPasswordHash = customerPasswordHash;
		this.customerPasswordSalt = customerPasswordSalt;
	}
    
	/**
	 * Constructor with all parameters
	 * 
	 * @param customerId
	 * @param customerName
	 * @param customerMobileNumber
	 * @param customerEmail
	 * @param customerDob
	 * @param customerPasswordHash
	 * @param customerPasswordSalt
	 */
	public Customers(int customerId, String customerName, String customerMobileNumber, String customerEmail,
			Date customerDob, String customerPasswordHash, String customerPasswordSalt) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobileNumber = customerMobileNumber;
		this.customerEmail = customerEmail;
		this.customerDob = customerDob;
		this.customerPasswordHash = customerPasswordHash;
		this.customerPasswordSalt = customerPasswordSalt;
	}

	/**
	 * Getter method for customerId
	 * 
	 * @return int: customerId
	 */
	public int getCustomerId() {
        return customerId;
    }

	/**
	 * Setter method for customerId
	 * 
	 * @param customerId: int
	 */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

	/**
	 * Getter method for customerName
	 * 
	 * @return String: customerName
	 */
    public String getCustomerName() {
        return customerName;
    }

	/**
	 * Setter method for customerName
	 * 
	 * @param customerName: String
	 */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
	 * Getter method for password
	 * 
	 * @return String: password
	 */
    public String getCustomerPasswordHash() {
        return customerPasswordHash;
    }

    /**
     * Setter method for password
     * 
     * @param customerPasswordHash: String
     */
    public void setCustomerPasswordHash(String customerPasswordHash) {
        this.customerPasswordHash = customerPasswordHash;
    }

    /**
     * Getter method for customerMobileNumber
     * 
     * @return String: customerMobileNumber
     */
    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

	/**
	 * Setter method for customerMobileNumber
	 * 
	 * @param customerMobileNumber: String
	 */
    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

     /**
      * Getter method for customerEmail
      * 
      * @return String: customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Setter method for customerEmail
     * 
     * @param customerEmail: String
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

	/**
	 * Getter method for customerDob
	 * 
	 * @return Date: customerDob
	 */
    public Date getCustomerDob() {
        return customerDob;
    }

    /**
     * Setter method for customerDob
     *
     * @param customerDob : Date
     */
    public void setCustomerDob(Date customerDob) {
        this.customerDob = customerDob;
    }

    /**
     * Getter method for password
     * 
     * @return String: password
     */
	public String getCustomerPassword() {
		return customerPasswordHash;
	}
	
	/**
	 * Setter method for password
	 * 
	 * @param customerPassword: String
	 */
	public void setCustomerPassword(String customerPassword) {
		this.customerPasswordHash = customerPassword;
	}
	
	/**
	 * Getter method for passwordHash
	 * 
	 * @return String: passwordHash
	 */
//	public String getCustomerPasswordHash() {
//		return customerPasswordHash;
//	}

	/**
	 * Setter method for passwordSalt
	 * 
	 * @param customerPasswordHash: String
	 */
	public void setCustomerPasswordSalt(String customerPasswordSalt) {
		this.customerPasswordSalt = customerPasswordSalt;
	}
	
	/**
	 * Getter method for passwordSalt
	 * 
	 * @return String: passwordSalt
	 */
	public String getCustomerPasswordSalt() {
		return customerPasswordSalt;
	}
	
	/**
	 * Method to return the string representation of the object
	 * 
	 * @return String: object representation
	 */
	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", customerMobileNumber="
				+ customerMobileNumber + ", customerEmail=" + customerEmail + ", customerDob=" + customerDob
				+ ", password=" + customerPasswordHash + "]" + ", passwordSalt=" + customerPasswordSalt + "]";
	}

}
