package com.manali.designPatterns.solidPrinciples.openClosePrinciple.ocpViolated;

import java.util.ArrayList;
import java.util.List;

public class OcpViolated {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addProduct(new Product("BMW", 100.00));
        cart.addProduct(new Product("Benz", 200.00));

        cart.calculatePrice();

        InvoicePrinter invoicePrinter = new InvoicePrinter(cart);
        invoicePrinter.printInvoice();

        CartStorage cartStorage = new CartStorage(cart);
        cartStorage.saveToMySQL();

    }
}

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

//only responsible for cart related logic
class Cart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculatePrice() {
        double sum = 0;
        for (Product product : products) {
            sum += product.price;
        }
        return sum;
    }
}

//only responsible for invoice printing logic
class InvoicePrinter {
    Cart cart;

    public InvoicePrinter(Cart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Product Name --- Price");
        for (Product product : cart.getProducts()) {
            System.out.println(product.name + "      " + product.price);
        }
        System.out.println("Total Price --- " + cart.calculatePrice());
    }
}

//only responsible for DB saving logic
//violates open close principle if any new saving method come we will have to add it here
class CartStorage {
    Cart cart;

    public CartStorage(Cart cart) {
        this.cart = cart;
    }

    public void saveToMySQL() {
        System.out.println("Save to MySQL");
    }

    public void saveToMongoDB() {
        System.out.println("Save to MongoDB");
    }
}
