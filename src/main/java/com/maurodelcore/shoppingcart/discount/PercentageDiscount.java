package com.maurodelcore.shoppingcart.discount;

import org.springframework.stereotype.Component;

/**
 * Applies a 10% discount to the cart subtotal.
 */
@Component
public class PercentageDiscount implements Discount {

    /**
     * {@inheritDoc}
     * Returns 10% of the given subtotal.
     */
    @Override
    public double getDiscount(double total) {
        return total * 0.10;
    }

    /** {@inheritDoc} */
    @Override
    public String getDiscountLabel() {
        return "Discount (10%): -£";
    }
}
