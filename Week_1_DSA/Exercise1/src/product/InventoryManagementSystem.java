package product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
    private Map<Integer, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product " + product.getProductName() + " added.");
        }
    }

    public void updateProduct(int productId, String productName, Integer quantity, Double price) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            if (productName != null && !productName.isEmpty()) {
                product.setProductName(productName);
            }
            if (quantity != null) {
                product.setQuantity(quantity);
            }
            if (price != null) {
                product.setPrice(price);
            }
            System.out.println("Product " + productId + " updated.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product " + productId + " deleted.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Adding a Product");
            System.out.println("2. Updating a Product");
            System.out.println("3. Deleting a Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            int choice = getIntInput(scanner, "Enter your choice:");

            switch (choice) {
                case 1:
                    addProduct(ims, scanner);
                    break;
                case 2:
                    updateProduct(ims, scanner);
                    break;
                case 3:
                    deleteProduct(ims, scanner);
                    break;
                case 4:
                    ims.displayInventory();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please Choose a valid one .");
            }
        }

        scanner.close();
    }

    private static void addProduct(InventoryManagementSystem ims, Scanner scanner) {
        int id = getIntInput(scanner, "Enter Product ID:");
        String name = getStringInput(scanner, "Enter Product Name:");
        int quantity = getIntInput(scanner, "Enter Quantity:");
        double price = getDoubleInput(scanner, "Enter Price:");
        Product product = new Product(id, name, quantity, price);
        ims.addProduct(product);
    }

    private static void updateProduct(InventoryManagementSystem ims, Scanner scanner) {
        int id = getIntInput(scanner, "Enter Product ID to update:");
        String name = getStringInput(scanner, "Enter new Product Name (or leave blank to keep current):");
        Integer quantity = getNullableIntInput(scanner, "Enter new Quantity (or leave blank to keep current):");
        Double price = getNullableDoubleInput(scanner, "Enter new Price (or leave blank to keep current):");
        ims.updateProduct(id, name.isEmpty() ? null : name, quantity, price);
    }

    private static void deleteProduct(InventoryManagementSystem ims, Scanner scanner) {
        int id = getIntInput(scanner, "Enter Product ID to delete:");
        ims.deleteProduct(id);
    }

    private static int getIntInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    private static double getDoubleInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private static String getStringInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private static Integer getNullableIntInput(Scanner scanner, String prompt) {
        String input = getStringInput(scanner, prompt);
        return input.isEmpty() ? null : Integer.parseInt(input);
    }

    private static Double getNullableDoubleInput(Scanner scanner, String prompt) {
        String input = getStringInput(scanner, prompt);
        return input.isEmpty() ? null : Double.parseDouble(input);
    }
}
