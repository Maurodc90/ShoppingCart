package com.maurodelcore.shoppingcart.discount;

import org.springframework.stereotype.Component;

/**
 * Applies a fixed £5 discount to the cart subtotal.
 * If the subtotal is less than £5, the discount equals the subtotal
 * so the total never goes below zero.
 */
@Component
public class FlatDiscount implements Discount {

    /**
     * {@inheritDoc}
     * Returns £5 if the subtotal exceeds £5, otherwise returns the subtotal itself.
     */
    @Override
    public double getDiscount(double total) {
        if (total > 5) {
            return 5.00;
        }
        return total;
    }

    /** {@inheritDoc} */
    @Override
    public String getDiscountLabel() {
        return "Discount (Flat): -£";
    }
}
