import java.util.Scanner;

/**
 * Main class to test and interact with the Smartphone class.
 * Demonstrates selection structures, loops, and attribute manipulation via getters/setters.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Creating objects using both constructors
        Smartphone defaultPhone = new Smartphone(); // Default Constructor
        Smartphone customPhone = new Smartphone("Samsung", "Galaxy S24", 256, 8, 799.99, 20, true); // Parameterized Constructor

        System.out.println("--- Initial Default Phone Info ---");
        defaultPhone.displayPhoneInfo();

        System.out.println("\n--- Initial Custom Phone Info ---");
        customPhone.displayPhoneInfo();

        // 2. Attribute manipulation using Getters and Setters
        System.out.println("\n>>> Updating Custom Phone using Setters...");
        customPhone.setPrice(749.99); // Applying a discount
        customPhone.setStorageCapacity(512); // Upgrading storage
        
        // Using getters to print updated individual attributes
        System.out.println("Updated Price for " + customPhone.getModel() + ": $" + customPhone.getPrice());
        System.out.println("Updated Storage: " + customPhone.getStorageCapacity() + "GB");

        // 3. Demonstration of Selection Structures (if-else / switch)
        System.out.println("\n>>> Battery Status Evaluation (Selection Structure):");
        int currentBattery = customPhone.getBatteryLevel();
        
        if (currentBattery < 20) {
            System.out.println("Warning: Battery is critically low (" + currentBattery + "%). Please charge immediately!");
        } else if (currentBattery >= 20 && currentBattery <= 80) {
            System.out.println("Battery level is optimal (" + currentBattery + "%).");
        } else {
            System.out.println("Battery is fully or near-fully charged (" + currentBattery + "%).");
        }

        // 4. Demonstration of Looping Structures (for loop)
        System.out.println("\n>>> Simulating usage cycle loop (Decrementing battery via loop):");
        for (int hour = 1; hour <= 3; hour++) {
            currentBattery -= 5; // Drain 5% battery per simulated hour of usage
            customPhone.setBatteryLevel(currentBattery);
            System.out.println("Hour " + hour + " usage completed. Battery remaining: " + customPhone.getBatteryLevel() + "%");
        }

        // 5. Interacting with custom methods (charging simulation)
        customPhone.chargePhone(45); // Charge for 45 minutes

        // 6. Interactive loop (while loop) with selection (switch statement)
        boolean running = true;
        while (running) {
            System.out.println("\n--- Smartphone Management Menu ---");
            System.out.println("1. View Phone Info");
            System.out.println("2. Charge Phone");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    customPhone.displayPhoneInfo();
                    break;
                case 2:
                    System.out.print("Enter minutes to charge: ");
                    int mins = scanner.nextInt();
                    customPhone.chargePhone(mins);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 1 and 3.");
            }
        }
        
        scanner.close();
    }
}