package com.maurodelcore.shoppingcart.shopstore;

/**
 * Represents a line item in the shopping cart with a name, unit price, and quantity.
 */
public class Item {
    private String name;
    private double price;
    private int quantity;

    /**
     * Creates a new item.
     * @param name the item name
     * @param price the unit price
     * @param quantity the number of units
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Calculates the total price for this item.
     * @return price multiplied by quantity
     */
    public double getLineTotal() {
        return quantity * price;
    }

    /** @return the item name */
    public String getName() {
        return name;
    }

    /** @return the number of units */
    public int getQuantity() {
        return quantity;
    }
}
