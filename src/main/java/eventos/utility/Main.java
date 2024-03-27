package eventos.utility;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Password :-> ");
		String password = scanner.nextLine();
		
		String[] result = PasswordEncryption.encryption(password);
		System.out.println("Hashed Password: " + result[0]);
		System.out.println("Salt: " + result[1]);
		
//		String hashpassword= "xmG3EP450BgJE6TcNlZsf5EAQPzOKnFkICmWAqzMp6I=";
//		String salt = "EVYytcu3HF6yyzp2nQeADg==";
//		
//		String password = "vidit123";
//		
//		boolean valid = PasswordDecryption.decryption(password, hashpassword, salt);
//		
//		System.out.println("Password is valid: " + valid);
		scanner.close();

	}

}