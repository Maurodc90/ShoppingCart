# Take-Home Exercise — Shopping Cart Service

**Company:** FreshMart Online Groceries
**Role:** Junior Java Developer
**Time estimate:** 1–2 hours
**Stack:** Java 26, Spring Boot

---

## Background

FreshMart is an online grocery store. We need a small backend service that handles shopping cart calculations. There is no UI and no database — this is a Spring Boot console application that demonstrates how you structure and wire components.

## Requirements

1. **A customer can add items to a cart.** Each item has a name, a unit price, and a quantity.

2. **The cart calculates a subtotal** — the sum of (price × quantity) for every item.

3. **FreshMart offers two discount strategies that can be swapped without changing the cart code:**
    - **Percentage discount** — takes a fixed percentage off the subtotal (e.g. 10%).
    - **Flat discount** — subtracts a fixed amount from the subtotal (e.g. £5 off). The total should never go below zero.

4. **The application prints a short receipt** to the console showing: each item with its line total, the subtotal, which discount was applied, and the final total.

## Constraints

- Use Spring Boot annotations to wire everything together. The cart should not create its own dependencies with `new`.
- The discount strategy must be injectable — switching from percentage to flat discount should require changing only the wiring configuration, not the cart logic.
- All monetary values can be `double` for simplicity.

## Example output

```
--- FreshMart Receipt ---
Milk x2          £2.50
Bread x1         £1.20
Apples x3        £2.70
Subtotal:        £6.40
Discount (10%):  -£0.64
Total:           £5.76
```

## What we're evaluating

- Can you break a problem into components with clear responsibilities?
- Do your components depend on abstractions, not concrete classes?
- Is Spring doing the wiring, or are you doing it manually?
- Does the code compile and run?

Good luck.