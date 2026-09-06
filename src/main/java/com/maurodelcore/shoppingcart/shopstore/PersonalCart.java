package com.maurodelcore.shoppingcart.shopstore;

import com.maurodelcore.shoppingcart.discount.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Spring-managed shopping cart that holds items and applies
 * an injected discount strategy to calculate the final total.
 */
@Component
public class PersonalCart {
    private ArrayList<Item> cartItems;
    private Discount discount;

    /**
     * Creates a cart with the specified discount strategy.
     * @param discount the discount strategy injected by Spring
     */
    @Autowired
    public PersonalCart(@Qualifier("percentageDiscount") Discount discount) {
        cartItems = new ArrayList<>();
        this.discount = discount;
    }

    /**
     * Returns the label for the applied discount strategy.
     * @return the discount label
     */
    public String getDiscountLabel() {
        return discount.getDiscountLabel();
    }

    /**
     * Prints each item in the cart with its name, quantity, and line total.
     */
    public void printItems() {
        for (Item item : cartItems) {
            System.out.println(item.getName() + " x" + item.getQuantity() + " £" + String.format("%.2f", item.getLineTotal()));
        }
    }

    /**
     * Adds an item to the cart.
     * @param item the item to add
     */
    public void addItem(Item item) {
        cartItems.add(item);
    }

    /**
     * Calculates the sum of all item line totals.
     * @return the cart subtotal
     */
    public double getSubtotal() {
        double cartTotal = 0;
        for (Item item : cartItems) {
            cartTotal = cartTotal + item.getLineTotal();
        }
        return cartTotal;
    }

    /**
     * Returns the discount amount applied to the subtotal.
     * @return the discount amount
     */
    public double getDiscountAmount() {
        return discount.getDiscount(getSubtotal());
    }

    /**
     * Calculates the final total after applying the discount.
     * @return the subtotal minus the discount
     */
    public double getFinalTotal() {
        double cartTotal = getSubtotal();
        double finalTotal = cartTotal - getDiscountAmount();
        return finalTotal;
    }
}
