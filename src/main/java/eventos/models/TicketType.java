package eventos.models;
/**
 * This class is used to create TicketType objects
 * TicketType objects are used to store ticket types for an event
 * 

 * Data Members:
 *    ticketTypeId: int
 *    eventId: int
 *    ticketType: String
 *    ticketPrice: double
 *    ticketQuantity: int
 *    
 * Methods:
 * 	 TicketType(): void - Default constructor
 *   TicketType(int, int, String, double, int): void - Constructor with 5 parameters
 *   TicketType(int, String, double, int): void - Constructor with 4 parameters
 *   getTicketId(): int - Getter method for ticketId
 *   setTicketId(int): void - Setter method for ticketId
 *   getEventId(): int - Getter method for eventId
 *   setEventId(int): void - Setter method for eventId
 *   getTicketType(): String - Getter method for ticketType
 *   setTicketType(String): void - Setter method for ticketType
 *   getTicketPrice(): double - Getter method for ticketPrice
 *   setTicketPrice(double): void - Setter method for ticketPrice
 *   getTicketQuantity(): int - Getter method for ticketQuantity
 *   setTicketQuantity(int): void - Setter method for ticketQuantity
 *   toString(): String - Method to return the string representation of the object
 *   
 * @category Models
 */



public class TicketType {
    private int ticketTypeId; // Unique ticket id
    private int eventId; // Event id for which the ticket is created
    private String ticketType; // Type of the ticket
    private float ticketPrice; // Price of the ticket
    private int ticketQuantity; // Quantity of the ticket


	public TicketType() {
		super();
	}
	/**
	 * This constructor is used to create a TicketType object with 5 parameters
	 * 
	 * @param ticketId: int
	 * @param eventId: int
	 * @param ticketType: String
	 * @param ticketPrice: double
	 * @param ticketQuantity: int
	 */
    public TicketType(int ticketId, int eventId, String ticketType, float ticketPrice, int ticketQuantity) {
        this.ticketTypeId = ticketId;
        this.eventId = eventId;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.ticketQuantity = ticketQuantity;
    }
    
    /**
     * This constructor is used to create a TicketType object with 4 parameters
     * 
	 * @param eventId: int
	 * @param ticketType: String
	 * @param ticketPrice: double
	 * @param ticketQuantity: int
	 */
    public TicketType(int eventId, String ticketType, float ticketPrice, int ticketQuantity) {
        this.eventId = eventId;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.ticketQuantity = ticketQuantity;
    }
    
    public TicketType(String ticketType, float ticketPrice, int ticketQuantity) {
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.ticketQuantity = ticketQuantity;
    }
    /**
     * This method is used to get the ticketId
     * 
     * @return int: ticketTypeId
     */
    public int getTicketId() {
        return ticketTypeId;
    }

	/**
	 * This method is used to set the ticketId
	 * 
	 * @param ticketId: int
	 */
    
    public void setTicketId(int ticketId) {
        this.ticketTypeId = ticketId;
    }

	/**
	 * This method is used to get the eventId
	 * 
	 * @return int: eventId
	 */
    public int getEventId() {
        return eventId;
    }

    /**
     * This method is used to set the eventId
     * @param eventId: int
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

	/**
	 * This method is used to get the ticketType
	 * 
	 * @return String: ticketType
	 */
    public String getTicketType() {
        return ticketType;
    }

	/**
	 * This method is used to set the ticketType
	 * 
	 * @param ticketType: String
	 */
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    /**
     * This method is used to get the ticketPrice
     * 
     * @return double: ticketPrice
     */
    public float getTicketPrice() {
        return ticketPrice;
    }

	/**
	 * This method is used to set the ticketPrice
	 * 
	 * @param ticketPrice: double
	 */
    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * This method is used to get the ticketQuantity
     * @return int: ticketQuantity
     */
    public int getTicketQuantity() {
        return ticketQuantity;
    }
    
	/**
	 * This method is used to set the ticketQuantity
	 * 
	 * @param ticketQuantity: int
	 */
    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
     }
    
    /**
     * This method is used to return the string representation of the object
     * 
     * @return String: String representation of the object
     */
	@Override
	public String toString() {
		return "TicketType [ticketId=" + ticketTypeId + ", eventId=" + eventId + ", ticketType=" + ticketType
				+ ", ticketPrice=" + ticketPrice + ", ticketQuantity=" + ticketQuantity + "]";
	}
}
