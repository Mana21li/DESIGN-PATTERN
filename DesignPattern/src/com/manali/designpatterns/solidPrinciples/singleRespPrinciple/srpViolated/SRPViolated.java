package com.manali.designpatterns.solidPrinciples.singleRespPrinciple.srpViolated;

import java.util.ArrayList;
import java.util.List;


class Product {
    public String productName;
    public double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}

class ShoppingCart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProduct() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("Shopping cart Invoice");
        System.out.println("Product" + "          " + "MRP");
        for (Product product : products) {
            System.out.println(product.productName + "         " + product.price);
        }
        System.out.println("Total Price: " + calculateTotal());
    }

    public void saveToDB() {
        System.out.println("Shopping cart Save to DB.....");
    }
}

public class SRPViolated {

    public static void main(String[] args) {
        //violated
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(new Product("Shampoo", 240.00));
        shoppingCart.addProduct(new Product("Soap", 325.50));
        shoppingCart.addProduct(new Product("Body Lotion", 400.00));

        shoppingCart.printInvoice();
        shoppingCart.saveToDB();
    }
}
