import java.util.LinkedHashSet;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UCS - Preserve Insertion Order of Bogies");
        System.out.println("====================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Adding bogies (including a duplicate to demonstrate behavior)
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate (will be ignored)

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        // Explanation note
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUCS formation setup completed...");
    }
}