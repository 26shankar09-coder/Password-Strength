import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");

        String password = sc.nextLine();

        int score = PasswordStrength.checkStrength(password);

        System.out.println("\nPassword Score : " + score);

        System.out.println("Strength : " +
                PasswordStrength.getStrength(score));

        String hashedPassword =
                PasswordHasher.hashPassword(password);

        System.out.println("\nSHA-256 Hash:");

        System.out.println(hashedPassword);

        System.out.print("\nEnter password again for verification: ");

        String verify = sc.nextLine();

        String verifyHash =
                PasswordHasher.hashPassword(verify);

        if(hashedPassword.equals(verifyHash))
            System.out.println("\nPassword Verified Successfully!");

        else
            System.out.println("\nIncorrect Password!");

        sc.close();

    }
}