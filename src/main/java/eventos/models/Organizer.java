/**
 * Class to represent the organizer entity in the database
 * 
 * @author Sumit Saini
 * @version 1.0
 * @since 10 March 2024
 * @lastUpdated 18 March 2024
 * 
 * Database Table: organizers
 * 
 * Data Members:
 *     organizerId: int
 *     organizerName: String
 *     organizerMobileNumber: String
 *     organizerEmail: String
 *     organizerPasswordHash: String
 *     organizerPasswordSalt: String
 *     
 * Methods:
 *    Default Constructor
 *    Parameterized Constructor
 *    Getters and Setters for all the data members
 *    toString: Method to return the string representation of the object
 *    
 * @category Models
 */

package eventos.models;

public class Organizer {
    private int organizerId;
    private String organizerName;
    private String organizerMobileNumber;
    private String organizerEmail;
    private String organizerPasswordHash;
    private String organizerPasswordSalt;

    /**
     * Default constructor
     */
    public Organizer() {
        super();
    }

    /**
     * Parameterized constructor without organizerId
     * 
	 * @param organizerName: String
	 * @param organizerMobileNumber: String
	 * @param organizerEmail: String
	 * @param organizerPasswordHash: String
	 * @param organizerPasswordSalt: String
	 */
	public Organizer(String organizerName, String organizerMobileNumber, String organizerEmail,
			String organizerPasswordHash, String organizerPasswordSalt) {
		this.organizerName = organizerName;
		this.organizerMobileNumber = organizerMobileNumber;
		this.organizerEmail = organizerEmail;
		this.organizerPasswordHash = organizerPasswordHash;
		this.organizerPasswordSalt = organizerPasswordSalt;
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param organizerId: int
	 * @param organizerName: String
	 * @param organizerMobileNumber: String
	 * @param organizerEmail: String
	 * @param organizerPasswordHash: String
	 * @param organizerPasswordSalt: String
	 */
	public Organizer(int organizerId, String organizerName, String organizerMobileNumber, String organizerEmail,
			String organizerPasswordHash, String organizerPasswordSalt) {
		this.organizerId = organizerId;
		this.organizerName = organizerName;
		this.organizerMobileNumber = organizerMobileNumber;
		this.organizerEmail = organizerEmail;
		this.organizerPasswordHash = organizerPasswordHash;
		this.organizerPasswordSalt = organizerPasswordSalt;
	}

	/**
	 * Method to get the organizerId\
	 * 
	 * @return int: organizerId
	 */
	public int getOrganizerId() {
        return organizerId;
    }

	/**
	 * Method to set the organizerId
	 * 
	 * @param organizerId: int
	 */
    public void setOrganizerId(int organizerId) {
        this.organizerId = organizerId;
    }

	/**
	 * Method to get the organizerName
	 * 
	 * @return String: organizerName
	 */
    public String getOrganizerName() {
        return organizerName;
    }

	/**
	 * Method to set the organizerName
	 * 
	 * @param organizerName: String
	 */
    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

	/**
	 * Method to get the organizerMobile
	 * 
	 * @return String: organizerMobileNumber
	 */
    public String getOrganizerMobile() {
        return organizerMobileNumber;
    }

    /**
     * Method to set the organizerMobile
     * 
     * @param organizerMobile: String
     */
    public void setOrganizerMobile(String organizerMobile) {
        this.organizerMobileNumber = organizerMobile;
    }

	/**
	 * Method to get the organizerEmail
	 * 
	 * @return String: organizerEmail
	 */
    public String getOrganizerEmail() {
        return organizerEmail;
    }

	/**
	 * Method to set the organizerEmail
	 * 
	 * @param organizerEmail: String
	 */
    public void setOrganizerEmail(String organizerEmail) {
        this.organizerEmail = organizerEmail;
    }

	/**
	 * Method to get the organizerPasswordHash
	 * 
	 * @return String: organizerPasswordHash
	 */
	public String getOrganizerPasswordHash() {
		return organizerPasswordHash;
	}

	/**
	 * Method to set the organizerPasswordHash
	 * 
	 * @param organizerPasswordHash: String
	 */
	public void setOrganizerPasswordHash(String organizerPasswordHash) {
		this.organizerPasswordHash = organizerPasswordHash;
	}

	/**
	 * Method to get the organizerPasswordSalt
	 * 
	 * @return String: organizerPasswordSalt
	 */
	public String getOrganizerPasswordSalt() {
		return organizerPasswordSalt;
	}
	
	/**
	 * Method to set the organizerPasswordSalt
	 * 
	 * @param organizerPasswordSalt: String
	 */
	public void setOrganizerPasswordSalt(String organizerPasswordSalt) {
		this.organizerPasswordSalt = organizerPasswordSalt;
	}
	
	/**
	 * Method to return the string representation of the object
	 * 
	 * @return String: object representation
	 */
	@Override
	public String toString() {
		return "Organizer [organizerId=" + organizerId + ", organizerName=" + organizerName + ", organizerMobile="
				+ organizerMobileNumber + ", organizerEmail=" + organizerEmail + "]";
	}

}
