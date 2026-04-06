import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("== Train Consist Management App ==");
        System.out.println("=========================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        System.out.println("\nCurrent Train Consist: " + trainConsist);
    }
}
