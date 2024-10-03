import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static String generatePassword(int length) {
        // Define character sets to choose from
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+<>?";

        // Combine all character sets into one string
        String allCharacters = upperCaseLetters + lowerCaseLetters + numbers + specialCharacters;

        // Use random class to generate random indexes from the password
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        // Generate random characters for the password
        for (int i=0; i<length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();  // Return the generated password

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for password length
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        // Generate and display the password
        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);

        // Close the scanner object
        scanner.close();
    }
}