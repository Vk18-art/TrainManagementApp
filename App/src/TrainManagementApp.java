import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure data is sorted (precondition)
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display sorted bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- BINARY SEARCH LOGIC ----
        int left = 0;
        int right = bogieIds.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (bogieIds[mid].equals(key)) {
                found = true;
                break;
            } else if (bogieIds[mid].compareTo(key) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " not found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}