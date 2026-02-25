package com.manali.singleRespPrinciple.srpFollowed;

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
    List<Product> products =  new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProduct() {
        return products;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }
}

class CartInvoicePrinter {
    private final ShoppingCart shoppingCart;

    public CartInvoicePrinter(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void printInvoice() {
        System.out.println("Shopping cart Invoice");
        System.out.println("Product" + "          " + "MRP");
        for (Product product : shoppingCart.getProduct()) {
            System.out.println(product.productName + "      Rs- " + product.price);
        }
        System.out.println("Total Price: " + shoppingCart.calculateTotalPrice());
    }
}

class ShoppingCartStorage {
    private ShoppingCart shoppingCart;

    public ShoppingCartStorage(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void saveToDB() {
        System.out.println("Shopping cart Save to DB.....");
    }
}

public class SRPFollowed {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("Shampoo", 240.00));
        shoppingCart.addProduct(new Product("Chips", 20.00));
        shoppingCart.addProduct(new Product("Biscuit", 20.00));

        CartInvoicePrinter cartInvoicePrinter = new CartInvoicePrinter(shoppingCart);
        cartInvoicePrinter.printInvoice();

        ShoppingCartStorage shoppingCartStorage = new ShoppingCartStorage(shoppingCart);
        shoppingCartStorage.saveToDB();

    }
}
