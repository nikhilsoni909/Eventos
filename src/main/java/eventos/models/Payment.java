/**
 * This class represents the Payment object
 * 
 * @version 1.0
 * @since 10 Mar 2024
 * @lastUpdated 18 Mar 2024
 * @author Vidit Pujara
 * @apiNote This class represents the Payment object
 * @implNote This class is used to create Payment object
 * 
 * Data Members:
 *     paymentId: int - The paymentId of the Payment (Eg: 1)
 *     bookingId: int - The bookingId of the Payment (Eg: 1)
 *     price: double - The price of the Payment (Eg: 100.0)
 *     referenceId: String - The referenceId of the Payment (Eg: "REF123")
 *     paymentStatus: String - The paymentStatus of the Payment (Eg: "S")
 *     paymentMethod: String - The paymentMethod of the Payment (Eg: "Credit Card")
 *     
 * Methods:
 *    Payment() - Default constructor
 *    Payment(int paymentId, int bookingId, double price, String referenceId, String paymentStatus, String paymentMethod) - Constructor with all parameters
 *    Payment(int bookingId, double price, String referenceId, String paymentStatus, String paymentMethod) - Constructor with all parameters except paymentId
 *    getPaymentId(): int - Getter method for paymentId
 *    setPaymentId(int paymentId): void - Setter method for paymentId
 *    getBookingId(): int - Getter method for bookingId
 *    setBookingId(int bookingId): void - Setter method for bookingId
 *    getPrice(): double - Getter method for price
 *    setPrice(double price): void - Setter method for price
 *    getReferenceId(): String - Getter method for referenceId
 *    setReferenceId(String referenceId): void - Setter method for referenceId
 *    getPaymentStatus(): String - Getter method for paymentStatus
 *    setPaymentStatus(String paymentStatus): void - Setter method for paymentStatus
 *    getPaymentMethod(): String - Getter method for paymentMethod
 *    setPaymentMethod(String paymentMethod): void - Setter method for paymentMethod
 *    toString(): String - Returns the string representation of the Payment object
 *    
 * @category Models
 */

package eventos.models;

public class Payment {
	
    private int paymentId;
    private int bookingId;
    private double price;
    private String referenceId;
    private String paymentStatus;
    private String paymentMethod;
    
    /**
     * Constructor for Payment class with no parameters
     */
    public Payment() {
        super();
    }

	/**
	 * Constructor for Payment class with all parameters
	 * 
	 * @param paymentId: int
	 * @param bookingId: int
	 * @param price:  double
	 * @param referenceId: String
	 * @param paymentStatus: String
	 * @param paymentMethod: String
	 */
    public Payment(int paymentId, int bookingId, double price, String referenceId, String paymentStatus, String paymentMethod) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.price = price;
        this.referenceId = referenceId;
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
   }

	/**
	 * Constructor for Payment class with all parameters except paymentId
	 * 
	 * @param bookingId: int
	 * @param price:  double
	 * @param referenceId: String
	 * @param paymentStatus: String
	 * @param paymentMethod: String
	 */
    public Payment(int bookingId, double price, String referenceId, String paymentStatus, String paymentMethod) {
        this.bookingId = bookingId;
        this.price = price;
        this.referenceId = referenceId;
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
   }

    /**
     * Getter and Setter methods for each attribute
     */
    
	/**
	 * This method returns the paymentId
	 * 
	 * @return int: the paymentId
	 */
    public int getPaymentId() {
        return paymentId;
    }

	/**
	 * This method sets the paymentId
	 * 
	 * @param paymentId: int
	 */
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

	/**
	 * This method returns the bookingId
	 * 
	 * @return int: the bookingId
	 */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * This method sets the bookingId
     * 
     * @param bookingId: int
     */
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

	/**
	 * This method returns the price
	 * 
	 * @return double: the price
	 */
    public double getPrice() {
        return price;
    }

	/**
	 * This method sets the price
	 * 
	 * @param price: double
	 */
    public void setPrice(double price) {
        this.price = price;
    }

	/**
	 * This method returns the referenceId
	 * 
	 * @return String: the referenceId
	 */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * This method sets the referenceId	
     * 
     * @param referenceId: String
     */
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

	/**
	 * This method returns the paymentStatus
	 * 
	 * @return String: the paymentStatus
	 */
    public String getPaymentStatus() {
        return paymentStatus;
    }

	/**
	 * This method sets the paymentStatus
	 * 
	 * @param paymentStatus: String
	 */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * This method returns the paymentMethod
     * 
     * @return String: the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

	/**
	 * This method sets the paymentMethod
	 * 
	 * @param paymentMethod: String
	 */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

	/**
	 * This method returns the string representation of the Payment object
	 * 
	 * @return String: the string representation of the Payment object
	 */
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", price=" + price + ", referenceId="
				+ referenceId + ", paymentStatus=" + paymentStatus + ", paymentMethod=" + paymentMethod + "]";
	}


}
