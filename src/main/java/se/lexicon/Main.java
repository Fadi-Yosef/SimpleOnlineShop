package se.lexicon;

public class Main {
    public static void main(String[] args) {

        Customer anna = new Customer(1, "Anna", "anna@email.com");

        Order order = new Order(1, anna);

        order.addProduct(new Product(1, "Notebook", 5.0), 1);
        order.addProduct(new Product(2, "Pen", 1.5), 2);
        order.addProduct(new Product(3, "Backpack", 25.0), 1);
        order.addProduct(new Product(4, "Water Bottle", 10.0), 1);
        order.addProduct(new Product(5, "Calculator", 15.0), 1);
        order.addProduct(new Product(6, "Headphones", 30.0), 1);
        order.addProduct(new Product(7, "Charger", 12.0), 1);
        order.addProduct(new Product(8, "Mouse", 8.0), 1);
        order.addProduct(new Product(9, "USB Cable", 4.0), 1);
        order.addProduct(new Product(10, "Planner", 7.0), 1);
        order.printSummary();
    }
}