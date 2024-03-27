/**
 * This is the DAO interface for the Organizer
 * 
 * @author: Vidit Pujara
 * @version: 1.0
 * @since: 10 March 2024
 * @lastUpdated: 18 March 2024
 */
package eventos.services;

import eventos.models.Organizer;

public interface OrganizerDAOInterface {

	String registerOrganizer(String organizerName, String organizerMobileNumber, String organizerEmail,
			String organizerPasswordHash, String organizerPasswordSalt);

	String registerOrganizer(Organizer organizer);

	boolean isRegistered(String emailId);

	boolean verifyOrganizer(String emailId, String password);

	Organizer getOrganizerDetails(String emailId, String password);
	String getOrganizerNameByEmail(String email);
	int getOrganizerIdByEmail(String email);
}
