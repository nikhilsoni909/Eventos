package eventos.utility;

import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;

import java.security.SecureRandom;
import java.util.Base64;

public class PasswordHashing {

    public static String hashPassword(String password, byte[] salt) {
        Argon2Parameters.Builder builder = new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id)
                .withVersion(Argon2Parameters.ARGON2_VERSION_13)
                .withIterations(10)
                .withMemoryAsKB(65536)
                .withParallelism(4)
                .withSalt(salt);

        Argon2BytesGenerator generator = new Argon2BytesGenerator();
        generator.init(builder.build());
        
        byte[] passwordBytes = password.getBytes();
        byte[] hash = new byte[32]; // Set to the appropriate hash length
        generator.generateBytes(passwordBytes, hash);

        return Base64.getEncoder().encodeToString(hash);
    }

    public static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }
    
    public static boolean verifyPassword(String password, String hashedPassword, byte[] salt) {
        String computedHash = hashPassword(password, salt);
        return hashedPassword.equals(computedHash);
    }
     
}
