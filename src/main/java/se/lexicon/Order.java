package se.lexicon;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<OrderItem> items;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    // Add product with quantity
    public void addProduct(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    // Calculate total price
    public double calculateTotalPrice() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Print order summary
    public void printSummary() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Number of items: " + items.size());

        for (OrderItem item : items) {
            System.out.println("- " + item.getProductName() +
                    " x" + item.getQuantity() +
                    " = " + item.getTotalPrice());
        }

        System.out.println("Total price: " + calculateTotalPrice());
    }
}
