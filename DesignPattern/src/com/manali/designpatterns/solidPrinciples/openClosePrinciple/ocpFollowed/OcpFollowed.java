package com.manali.designpatterns.solidPrinciples.openClosePrinciple.ocpFollowed;

import java.util.ArrayList;
import java.util.List;

public class OcpFollowed {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addProduct(new Product("BMW", 100.00));
        cart.addProduct(new Product("Benz", 200.00));

        cart.calculatePrice();

        InvoicePrinter invoicePrinter = new InvoicePrinter(cart);
        invoicePrinter.printInvoice();

        DBPersistence mongo = new MongoDBPersistence();
        DBPersistence mySql = new MySQLPersistence();

        mySql.save();
        mongo.save();

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
//follows ocp
interface DBPersistence {
    void save();
}

class MySQLPersistence implements DBPersistence {
    @Override
    public void save() {
        System.out.println("Save to MySQL");
    }
}

class MongoDBPersistence implements DBPersistence {
    @Override
    public void save() {
        System.out.println("Save to MongoDB");
    }
}
