package computer;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer customPC = new Computer.ComputerBuilder()
            .withProcessor("Intel i7")
            .withGraphicsCard("GT370")
            .withMemory("16 GB")
            .withDiskSpace("500GB")
            .build();
        System.out.println(customPC.displayInfo());
    }
}
