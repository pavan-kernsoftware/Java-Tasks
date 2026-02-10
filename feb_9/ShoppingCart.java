package feb_9;

import java.util.ArrayList;
class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        cart.add(new Product("Apple", 50.0));
        cart.add(new Product("Milk", 40.0));
        cart.add(new Product("Bread", 30.0));
        double totalBill = 0;
        System.out.println("Products in Cart:");
        for (Product p : cart) {
            System.out.println(p.name + " - Rs. " + p.price);
            totalBill += p.price;
        }
        System.out.println("Total Bill: Rs. " + totalBill);
    }
}
