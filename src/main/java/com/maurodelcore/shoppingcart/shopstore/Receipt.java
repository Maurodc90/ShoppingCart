package com.maurodelcore.shoppingcart.shopstore;

import org.springframework.stereotype.Component;

/**
 * Prints a formatted receipt for a given shopping cart.
 */
@Component
public class Receipt {

    /**
     * Prints a receipt showing all items, subtotal, discount, and final total.
     * @param cart the cart to print the receipt for
     */
    public void printReceipt(PersonalCart cart) {
        System.out.println("--- FreshMart Receipt ---");
        cart.printItems();
        System.out.println("Subtotal: £" + String.format("%.2f", cart.getSubtotal()));
        System.out.print(cart.getDiscountLabel());
        System.out.println(String.format("%.2f", cart.getDiscountAmount()));
        System.out.println("Total: £" + String.format("%.2f", cart.getFinalTotal()));
        System.out.println("--- FreshMart Receipt ---");
    }
}
