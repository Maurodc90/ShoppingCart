# ShoppingCart

A Spring Boot console application built as a take-home exercise for FreshMart Online Groceries.

## What it does

Simulates a shopping cart that calculates subtotals, applies a discount strategy, and prints a formatted receipt to the console.

## Key concepts demonstrated

- **Strategy pattern via interface** — `Discount` interface with `FlatDiscount` and `PercentageDiscount` implementations. Swapping strategy requires changing only the `@Qualifier` value.
- **Spring Boot autowiring** — `@Component`, `@Autowired`, `@Qualifier` for dependency injection. No manual `new` for Spring-managed beans.
- **Separation of concerns** — `PersonalCart` handles cart logic, `Receipt` handles display, `Item` holds line data.

## Project structure

- `discount/` — `Discount` interface, `FlatDiscount`, `PercentageDiscount`
- `shopstore/` — `Item`, `PersonalCart`, `Receipt`
- `ShoppingcartApplication` — entry point

## Example output
```
--- FreshMart Receipt ---
Apple x10 £10.00
Milk x5 £10.00
Bread x8 £12.00
Subtotal: £32.00
Discount (10%): -£3.20
Total: £28.80
--- FreshMart Receipt ---
```


## Built with

- Java 26
- Spring Boot
