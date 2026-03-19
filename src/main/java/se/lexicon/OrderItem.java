package se.lexicon;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public String getProductName() {
        return product.getName();
    }

    public int getQuantity() {
        return quantity;
    }
}
