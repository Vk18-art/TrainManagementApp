import java.util.Scanner;
import java.util.regex.Pattern;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("====================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "[A-Z]{3}-[A-Z]{2}";

        // Validate inputs
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}