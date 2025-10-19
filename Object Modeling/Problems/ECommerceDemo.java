import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.showProduct();
        }
    }
}

class Customer1 {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    Customer1(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    void showOrders() {
        System.out.println("Customer: " + name + " has orders:");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Customer1 c1 = new Customer1("Alice");

        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Mouse", 25.0);
        Product p3 = new Product("Keyboard", 50.0);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p2);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.showOrders();
    }
}
