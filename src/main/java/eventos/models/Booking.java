package eventos.models;


/**
 * This class is used to represent the booking object and its attributes
 * 
 * @author Sumit Saini
 * @version 1.0
 * @since 10 March 2024
 * @lastUpdated 18 March 2024
 * @see java.sql.Timestamp
 * 
 * Data Members:
 *    bookingId: int
 *    customerId: int
 *    eventId: int
 *    ticketTypeId: int
 *    bookingTimestamp: Timestamp
 *    bookingQuantity: int
 *    bookingPrice: double
 *    
 * Methods:
 *   Booking(): void - Default constructor with no parameters
 *   Booking(int, int, int, int, Timestamp, int, double): void - Constructor with all parameters
 *   Booking(int, int, int, Timestamp, int, double): void - Constructor with all parameters except bookingId
 *   getBookingId(): int - Getter method for bookingId
 *   setBookingId(int): void - Setter method for bookingId
 *   getCustomerId(): int - Getter method for customerId
 *   setCustomerId(int): void - Setter method for customerId
 *   getEventId(): int - Getter method for eventId
 *   setEventId(int): void - Setter method for eventId
 *   getTicketTypeId(): int - Getter method for ticketTypeId
 *   setTicketTypeId(int): void - Setter method for ticketTypeId
 *   getBookingTimestamp(): Timestamp - Getter method for bookingTimestamp
 *   setBookingTimestamp(Timestamp): void - Setter method for bookingTimestamp
 *   getBookingQuantity(): int - Getter method for bookingQuantity
 *   setBookingQuantity(int): void - Setter method for bookingQuantity
 *   getBookingPrice(): double - Getter method for bookingPrice
 *   setBookingPrice(double): void - Setter method for bookingPrice
 *   toString(): String - Method to return the string representation of the object
 *   
 * Dependencies:
 *       java.sql.Timestamp
 * 
 * @category Models
 */


import java.sql.Timestamp;

public class Booking {
    private int bookingId;
    private int customerId;
    private int eventId;
    private int ticketTypeId;
    private Timestamp bookingTimestamp;
    private int bookingQuantity;
    private double bookingPrice;
    
    /**
     * Default constructor
     */
    public Booking() {
        super();
    }
    
    /**
	 * Constructor with all the parameters
     * 
     * @param bookingId
     * @param customerId
     * @param eventId
     * @param ticketId
     * @param bookingTimestamp
     * @param bookingQuantity
     * @param bookingPrice
     */
    public Booking(int bookingId, int customerId, int eventId, int ticketTypeId, Timestamp bookingTimestamp, int bookingQuantity, double bookingPrice) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.eventId = eventId;
        this.ticketTypeId = ticketTypeId;
        this.bookingTimestamp = bookingTimestamp;
        this.bookingQuantity = bookingQuantity;
        this.bookingPrice = bookingPrice;
    }

    /**
     * Constructor with all the parameters except bookingId
     * 
     * @param customerId
     * @param eventId
     * @param ticketId
     * @param bookingTimestamp
     * @param bookingQuantity
     * @param bookingPrice
     */
    public Booking(int customerId, int eventId, int ticketTypeId, Timestamp bookingTimestamp, int bookingQuantity, double bookingPrice) {
        this.customerId = customerId;
        this.eventId = eventId;
        this.ticketTypeId = ticketTypeId;
        this.bookingTimestamp = bookingTimestamp;
        this.bookingQuantity = bookingQuantity;
        this.bookingPrice = bookingPrice;
    }

    /**
     * Method to get the bookingId
     * 
     * @return int: bookingId
     */
    public int getBookingId() {
        return bookingId;
    }

	/**
	 * Method to set the bookingId
	 * 
	 * @param bookingId: int
	 */
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

	/**
	 * Method to get the customerId
	 * 
	 * @return int: customerId
	 */
    public int getCustomerId() {
        return customerId;
    }

	/**
	 * Method to set the customerId
	 * 
	 * @param customerId: int
	 */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

	/**
	 * Method to get the eventId
	 * 
	 * @return int: eventId
	 */
    public int getEventId() {
        return eventId;
    }

    /**
     * Method to set the eventId
     * 
     * @param eventId: int
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

	/**
	 * Method to get the ticketTypeId
	 * 
	 * @return int: ticketTypeId
	 */
    public int getTicketTypeId() {
        return ticketTypeId;
    }

    /**
     * Method to set the ticketId
     * 
     * @param ticketTypeId: int
     */
    public void setTicketTypeId(int ticketTypeId) {
        this.ticketTypeId = ticketTypeId;
    }

    /**
     * Method to get the bookingTimestamp
     * 
     * @return Timestamp: bookingTimestamp
     */
    public Timestamp getBookingTimestamp() {
        return bookingTimestamp;
    }

	/**
	 * Method to set the bookingTimestamp
	 * 
	 * @param bookingTimestamp: Timestamp
	 */
    public void setBookingTimestamp(Timestamp bookingTimestamp) {
        this.bookingTimestamp = bookingTimestamp;
    }

	/**
	 * Method to get the bookingQuantity
	 * 
	 * @return int: bookingQuantity
	 */
    public int getBookingQuantity() {
        return bookingQuantity;
    }

    /**
     * Method to set the bookingQuantity
     * 
     * @param bookingQuantity: int
     */
    public void setBookingQuantity(int bookingQuantity) {
        this.bookingQuantity = bookingQuantity;
    }

    /**
     * Method to get the bookingPrice
     * 
     * @return double: bookingPrice
     */
    public double getBookingPrice() {
        return bookingPrice;
    }

	/**
	 * Method to set the bookingPrice
	 * 
	 * @param bookingPrice: double
	 */
    public void setBookingPrice(double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    /**
     * Method to get String representation of the object
     * 
     * @return String: String representation of the object
     */
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerId=" + customerId + ", eventId=" + eventId + ", ticketId="
				+ ticketTypeId + ", bookingTimestamp=" + bookingTimestamp + ", bookingQuantity=" + bookingQuantity
				+ ", bookingPrice=" + bookingPrice + "]";
	}

}
