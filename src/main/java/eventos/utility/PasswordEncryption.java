package eventos.utility;

import java.util.Base64;

//import  com.project.eventos.models.PasswordHashing;

public class PasswordEncryption {
	
	public static String[] encryption(String password) {

		byte[] salt = PasswordHashing.generateSalt();
        String hashedPassword = PasswordHashing.hashPassword(password, salt);
        
        String SALT = Base64.getEncoder().encodeToString(salt);
        String[] result = {hashedPassword, SALT};
        return result;
    }
	
	
		
}