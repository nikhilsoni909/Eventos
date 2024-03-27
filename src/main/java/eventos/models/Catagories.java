/**
 * This class is used to represent the catagory object and its attributes
 * 
 * @author: Vidit Pujara
 * @version: 1.0
 * @since: 10 March 2024
 * @lastUpdated: 18 March 2024
 * 
 * Data Members:
 *  catagoryId: int
 *  catagoryName: String
 *  catagoryDescription: String
 *  
 * Methods:
 * 	Default constructor
 *  Parameterized constructor
 *  Parameterized constructor without catagoryId
 *  Getter and Setter methods for all data members
 *  toString(): String - Method to return the string representation of the object
 *  
 * @category Models
 */
package eventos.models;

public class Catagories {
	
	private int catagoryId;
	private String catagoryName;
	private String catagoryDescription;

	/**
	 * Default constructor
	 */
	public Catagories() {
		super();
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param catagoryId
	 * @param catagoryName
	 * @param catagoryDescription
	 */
	public Catagories(int catagoryId, String catagoryName, String catagoryDescription) {
		this.catagoryId = catagoryId;
		this.catagoryName = catagoryName;
		this.catagoryDescription = catagoryDescription;
	}
	
	/**
	 * Parameterized constructor without catagoryId
	 * 
	 * @param catagoryName
	 * @param catagoryDescription
	 */
	public Catagories(String catagoryName, String catagoryDescription) {
		this.catagoryName = catagoryName;
        this.catagoryDescription = catagoryDescription;
	}

	/**
	 * @return the catagoryId
	 */
	public int getCatagoryId() {
		return catagoryId;
	}

	/**
	 * @param catagoryId the catagoryId to set
	 */
	public void setCatagoryId(int catagoryId) {
		this.catagoryId = catagoryId;
	}

	/**
	 * @return the catagoryName
	 */
	public String getCatagoryName() {
		return catagoryName;
	}

	/**
	 * @param catagoryName the catagoryName to set
	 */
	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}

	/**
	 * @return the catagoryDescription
	 */
	public String getCatagoryDescription() {
		return catagoryDescription;
	}

	/**
	 * @param catagoryDescription the catagoryDescription to set
	 */
	public void setCatagoryDescription(String catagoryDescription) {
		this.catagoryDescription = catagoryDescription;
	}

	/**
	 * Method to return the string representation of the object
	 */
	@Override
	public String toString() {
		return "Catagories [catagoryId=" + catagoryId + ", catagoryName=" + catagoryName + ", catagoryDescription="
				+ catagoryDescription + "]";
		
	}	
	
}