package com.maurodelcore.shoppingcart;

import com.maurodelcore.shoppingcart.shopstore.Item;
import com.maurodelcore.shoppingcart.shopstore.PersonalCart;
import com.maurodelcore.shoppingcart.shopstore.Receipt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Entry point for the FreshMart Shopping Cart application.
 * Demonstrates Spring Boot autowiring with a qualifier-based
 * discount strategy injection.
 */
@SpringBootApplication
public class ShoppingcartApplication {

    /**
     * Runs the application, adds sample items to the cart, and prints a receipt.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ShoppingcartApplication.class, args);
        PersonalCart myCart = ctx.getBean(PersonalCart.class);
        Receipt myReceipt = ctx.getBean(Receipt.class);
        Item apple = new Item("Apple", 1.0, 10);
        Item milk = new Item("Milk", 2.0, 5);
        Item bread = new Item("Bread", 1.5, 8);
        myCart.addItem(apple);
        myCart.addItem(milk);
        myCart.addItem(bread);

        myReceipt.printReceipt(myCart);
    }
}
