package ecommerce;

public class EcommerceSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Book", "Books"),
            new Product(4, "Headphones", "Electronics"),
            new Product(5, "Shoes", "Fashion")
        };
        searchAndPrint(products, "Book");
        searchAndPrint(products, "pen");
        searchAndPrintSorted(products, "Book");
        searchAndPrintSorted(products, "Table");
    }

    private static void searchAndPrint(Product[] products, String name) {
        Product result = SearchAlgo.linearSearch(products, name);
        System.out.println(result != null ? result : "Product not found");
    }

    private static void searchAndPrintSorted(Product[] products, String name) {
        Product result = SearchAlgo.binarySearch(products, name);
        System.out.println(result != null ? result : "Product not found");
    }
}
