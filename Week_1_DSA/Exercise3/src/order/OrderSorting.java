package order;

public class OrderSorting {
    public static void main(String[] args) {
        Order[] orders = initializeOrders();

        System.out.println("Orders sorted by Bubble Sort:");
        SortingAlgorithms.bubbleSort(orders);
        displayOrders(orders);

        Order[] ordersForQuickSort = initializeOrders();

        System.out.println("\nOrders sorted by Quick Sort:");
        SortingAlgorithms.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        displayOrders(ordersForQuickSort);
    }

    private static Order[] initializeOrders() {
        return new Order[]{
            new Order(1, "Neeha", 248.50),
            new Order(2, "Harsha", 130.75),
            new Order(3, "Pandu", 300.20),
            new Order(4, "Durga", 50.00),
            new Order(5, "Sai", 400.00)
        };
    }

    private static void displayOrders(Order[] orders) {
        for (Order order : orders) {
 
