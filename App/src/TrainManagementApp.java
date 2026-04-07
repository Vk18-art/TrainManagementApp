import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("====================================\n");

        // Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original names
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display sorted names
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}