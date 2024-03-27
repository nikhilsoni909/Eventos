/**
 * This class is used to represent the event object and its attributes
 * 
 * @author Sumit Saini
 * @version 1.0
 * @since 10 March 2024
 * @lastUpdated 18 March 2024
 * @see java.sql.Date
 * 
 * Data Members:
 *   eventId: int
 *   eventName: String
 *   eventVenue: String
 *   eventCategory: int
 *   eventCity: int
 *   eventDateTime: Date
 *   eventDescription: String
 *   eventBanner: String
 *   organizerId: int
 *   
 * Methods:
 * 	Events(): void - Default constructor with no parameters
 *  Events(int, String, String, int, int, Date, String, String, int): void - Constructor with all parameters
 *  Events(String, String, int, int, Date, String, String, int): void - Constructor with all parameters except eventId
 *  getEventId(): int - Getter method for eventId
 *  setEventId(int): void - Setter method for eventId
 *  getEventName(): String - Getter method for eventName
 *  setEventName(String): void - Setter method for eventName
 *  getEventVenue(): String - Getter method for eventVenue
 *  setEventVenue(String): void - Setter method for eventVenue
 *  geteventCategory(): int - Getter method for eventCategory
 *  seteventCategory(int): void - Setter method for eventCategory
 *  getEventCity(): int - Getter method for eventCity
 *  setEventCity(int): void - Setter method for eventCity
 *  getEventDateTime(): Date - Getter method for eventDateTime
 *  setEventDateTime(Date): void - Setter method for eventDateTime
 *  getEventDescription(): String - Getter method for eventDescription
 *  setEventDescription(String): void - Setter method for eventDescription
 *  getEventBanner(): String - Getter method for eventBanner
 *  setEventBanner(String): void - Setter method for eventBanner
 *  getOrganizerId(): int - Getter method for organizerId
 *  setOrganizerId(int): void - Setter method for organizerId
 *  toString(): String - Method to return the string representation of the object
 *  
 * Dependencies:
 *      java.sql.Date
 *      
 * @category Models
 */

package eventos.models;


import java.sql.Date;
import java.sql.Timestamp;

public class Events {
    private int eventId;
    private String eventName;
    private String eventVenue;
    private String eventCategory;
    private String eventCity;
    private Timestamp eventDateTime;
    private String eventDescription;
    private String eventBanner;
    private int organizerId;

    /**
     * Default constructor
     */
    public Events() {
        super();
    }

    

    /**
     * Parameterized constructor
     * 
	 * @param eventId
	 * @param eventName
	 * @param eventVenue
	 * @param eventCategory
	 * @param eventCity
	 * @param eventDateTime
	 * @param eventDescription
	 * @param eventBanner
	 * @param organizerId
	 */
	public Events(int eventId, String eventName, String eventVenue, String eventCategory, String eventCity,
			Timestamp eventDateTime, String eventDescription, String eventBanner, int organizerId) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventVenue = eventVenue;
		this.eventCategory = eventCategory;
		this.eventCity = eventCity;
		this.eventDateTime = eventDateTime;
		this.eventDescription = eventDescription;
		this.eventBanner = eventBanner;
		this.organizerId = organizerId;
	}

	

	/**
	 * Parameterized constructor without eventId
	 * 
	 * @param eventName
	 * @param eventVenue
	 * @param eventCategory
	 * @param eventCity
	 * @param eventDateTime2
	 * @param eventDescription
	 * @param eventBanner
	 * @param organizerId
	 */
	public Events(String eventName, String eventVenue, String eventCategory, String eventCity, Timestamp eventDateTime2,
			String eventDescription, String eventBanner, int organizerId) {
		this.eventName = eventName;
		this.eventVenue = eventVenue;
		this.eventCategory = eventCategory;
		this.eventCity = eventCity;
		this.eventDateTime = eventDateTime2;
		this.eventDescription = eventDescription;
		this.eventBanner = eventBanner;
		this.organizerId = organizerId;
	}



	/**
     * Method to get eventId
     * 
     * @return int: eventId
     */
    public int getEventId() {
        return eventId;
    }

	/**
	 * Method to set eventId
	 * 
	 * @param eventId: int
	 */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

	/**
	 * Method to get eventName
	 * 
	 * @return String: eventName
	 */
    public String getEventName() {
        return eventName;
    }

    /**
     * Method to set eventName
     * 
     * @param eventName: String
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

	/**
	 * Method to get eventVenue
	 * 
	 * @return String: eventVenue
	 */
    public String getEventVenue() {
        return eventVenue;
    }

	/**
	 * Method to set eventVenue
	 * 
	 * @param eventVenue: String
	 */
    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

	/**
	 * Method to get eventBanner
	 * 
	 * @return String: eventBanner
	 */
	public String getEventCategory() {
		return eventCategory;
	}
	
	/**
	 * Method to set eventBanner
	 * 
	 * @param eventBanner: String
	 */
	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}
	
	/** 
	 * Method to get eventCity
	 * 
	 * @return int: eventCity
	 */
    public String getEventCity() {
        return eventCity;
    }

	/**
	 * Method to set eventCity
	 * 
	 * @param eventCity: int
	 */
    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
    }

	/**
	 * Method to get eventBanner
	 * 
	 * @return String: eventBanner
	 */
	public String getEventBanner() {
		return eventBanner;
	}
	
	/**
	 * Method to set eventBanner
	 * 
	 * @return String: eventBanner
	 */
	public void setEventBanner(String eventBanner) {
		this.eventBanner = eventBanner;
	}

	/**
	 * Method to get eventDateTime
	 * 
	 * @return Date: eventDateTime
	 */
	public Timestamp getEventDateTime() {
		return eventDateTime;
	}

	/**
	 * Method to set eventDateTime
	 * 
	 * @param eventDateTime: Date
	 */
	public void setEventDateTime(Timestamp eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	/**
	 * Method to get eventDescription
	 * 
	 * @return String: eventDescription
	 */
	public String getEventDescription() {
		return eventDescription;
	}

	/**
	 * Method to set eventDescription
	 * 
	 * @param eventDescription: String
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	/**
	 * Method to get organizerId
	 * 
	 * @return int: organizerId
	 */
	public int getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(int organizerId) {
		this.organizerId = organizerId;
	}

	/**
	 * Method to get String representation of Events
	 * 
	 * @return String: Events object
	 */
	@Override
	public String toString() {
		return "Events [eventId=" + eventId + ", eventName=" + eventName + ", eventVenue=" + eventVenue + ", eventCity="
				+ eventCity + ", eventDateTime=" + eventDateTime + ", eventDescription=" + eventDescription
				+ ", organizerId=" + organizerId + "]";
	}


}
