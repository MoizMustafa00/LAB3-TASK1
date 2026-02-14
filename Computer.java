package Lab_03_Tasks;

public class Computer {
    String systemID;
    String processorType;
    int ramSize;
    String operatingSystem;

    Computer() {
        systemID = "Unknown ID";
        processorType = "Unknown Processor";
        ramSize = 0;
        operatingSystem = "Unknown Operating System";
    }

    Computer(String ID, String processor, int size, String os) {
        this.systemID = ID;
        this.processorType = processor;
        this.ramSize = size;
        this.operatingSystem = os;
    }

    void display() {
        System.out.println("System ID: " + systemID);
        System.out.println("Processor Type: " + processorType);
        System.out.println("Ram Size: " + ramSize);
        System.out.println("Operating System: " + operatingSystem);
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.display();
        Computer computer2 = new Computer("Lab-PC01", "Intel Core i9", 32, "Windows 11");
        computer2.display();
        Computer computer3 = new Computer("Lab-PC02", "AMD Ryzen 5", 16, "Windows 10");
        computer3.display();
    }
}
