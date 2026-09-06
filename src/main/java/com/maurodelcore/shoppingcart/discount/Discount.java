package com.maurodelcore.shoppingcart.discount;

/**
 * Contract for discount strategies applied to a shopping cart subtotal.
 * Implementations define how the discount is calculated and labeled.
 */
public interface Discount {
    /**
     * Calculates the discount amount for the given subtotal.
     * @param total the cart subtotal before discount
     * @return the amount to subtract from the subtotal
     */
    double getDiscount(double total);

    /**
     * Returns a label describing this discount for receipt display.
     * @return the formatted discount label
     */
    String getDiscountLabel();
}
