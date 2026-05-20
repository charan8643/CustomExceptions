package CustomExceptions.product;

import CustomExceptions.exception.OutOfStockException;

public class Product {

    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void purchase(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Product out of stock");
        }

        stock -= quantity;
        System.out.println(quantity + " items purchased");
    }
}