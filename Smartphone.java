/**
 * Class representing a Smartphone, demonstrating encapsulation, 
 * constructors, getters, setters, and custom methods.
 */
public class Smartphone {
    // 1. Attributes (Encapsulated as private)
    private String brand;
    private String model;
    private int storageCapacity; // in GB
    private int ramSize;         // in GB
    private double price;        // in USD
    private int batteryLevel;    // Percentage (0 - 100)
    private boolean is5GEnabled;

    /**
     * 2. Default Constructor
     * Initializes the smartphone with default generic values.
     */
    public Smartphone() {
        this.brand = "Unknown";
        this.model = "Generic";
        this.storageCapacity = 128;
        this.ramSize = 8;
        this.price = 499.99;
        this.batteryLevel = 50;
        this.is5GEnabled = true;
    }

    /**
     * 3. Parameterized Constructor
     * Initializes the smartphone with user-defined values for all 7 attributes.
     */
    public Smartphone(String brand, String model, int storageCapacity, int ramSize, double price, int batteryLevel, boolean is5GEnabled) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.ramSize = ramSize;
        this.price = price;
        this.batteryLevel = batteryLevel;
        this.is5GEnabled = is5GEnabled;
    }

    // --- 4. Getters (Required: at least 5) ---
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    // --- 5. Setters (Required: all 7 attributes) ---
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity > 0) {
            this.storageCapacity = storageCapacity;
        }
    }

    public void setRamSize(int ramSize) {
        if (ramSize > 0) {
            this.ramSize = ramSize;
        }
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        }
    }

    public void setIs5GEnabled(boolean is5GEnabled) {
        this.is5GEnabled = is5GEnabled;
    }

    // --- 6. Additional Methods (Required: at least 2 meaningful operations) ---

    /**
     * Additional Method 1: Displays complete specifications of the smartphone.
     */
    public void displayPhoneInfo() {
        System.out.println("========================================");
        System.out.println("         SMARTPHONE SPECIFICATIONS      ");
        System.out.println("========================================");
        System.out.println("Brand & Model  : " + brand + " " + model);
        System.out.println("Storage / RAM  : " + storageCapacity + "GB / " + ramSize + "GB RAM");
        System.out.println("Price          : $" + price);
        System.out.println("Battery Level  : " + batteryLevel + "%");
        System.out.println("5G Capable     : " + (is5GEnabled ? "Yes" : "No"));
        System.out.println("========================================");
    }

    /**
     * Additional Method 2: Simulates charging the phone based on minutes plugged in.
     * Increases battery level by 1% per minute, capping at 100%.
     */
    public void chargePhone(int minutes) {
        System.out.println("\n[Charging " + brand + " " + model + " for " + minutes + " minutes...]");
        int addedBattery = minutes * 1; // 1% per minute
        this.batteryLevel += addedBattery;
        
        if (this.batteryLevel > 100) {
            this.batteryLevel = 100;
        }
        System.out.println("Current Battery Level: " + this.batteryLevel + "%");
    }
}