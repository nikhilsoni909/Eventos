package eventos.utility;

import java.util.Base64;

//import  com.project.eventos.models.PasswordHashing;

public class PasswordDecryption {
	
	public static boolean decryption(String password, String hashedPassword, String salt) {
		byte[] saltBytes = Base64.getDecoder().decode(salt);
		return PasswordHashing.verifyPassword(password, hashedPassword, saltBytes);
	}

}
