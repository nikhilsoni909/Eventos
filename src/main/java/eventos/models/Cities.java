/**
 * This class is used to represent the cities object and its attributes
 * 
 * @author: Vidit Pujara
 * @version: 1.0
 * @since: 10 March 2024
 * @lastUpdated: 18 March 2024
 * 
 * Data Members:
 * 	cityId: int
 *  cityName: String
 *  State: String
 *  country: String
 *  
 * Methods:
 *     Default constructor
 *     Parameterized constructor
 *     Parameterized constructor without cityId
 *     Getter and Setter methods for all data members
 *     toString(): String - Method to return the string representation of the object
 *     
 * @category Models
 */

package eventos.models;

public class Cities {

	private int cityId;
	private String cityName;
	private String State;
	private String country;

	/**
	 * Default constructor
	 */
	public Cities() {
		super();
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param cityId
	 * @param cityName
	 * @param state
	 * @param country
	 */
	public Cities(int cityId, String cityName, String state, String country) {
		this.cityId = cityId;
		this.cityName = cityName;
		State = state;
		this.country = country;
	}
	
	/**
	 * Parameterized constructor without cityId
	 * 
	 * @param cityName
	 * @param state
	 * @param country
	 */
	public Cities(String cityName, String state, String country) {
		this.cityName = cityName;
		State = state;
		this.country = country;
	}

	/**
	 * @return the cityId
	 */
	public int getCityId() {
		return cityId;
	}

	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}
