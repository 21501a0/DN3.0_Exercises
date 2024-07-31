package order;

/**
 * Represents an order with an ID, customer name, and total price.
 */
public class Order {
    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        String formattedPrice = String.format("%.2f", totalPrice);
        return String.format("Order ID: %d, Customer: %s, Total Price: %s",
                             orderId, customerName, formattedPrice);
    }
}
