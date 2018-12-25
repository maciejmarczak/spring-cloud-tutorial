package pl.kodujze.tutorials.microservices.cart;

import java.math.BigDecimal;

public class Product {
    
    private final long id;

    private final BigDecimal price;

    public Product(long id, BigDecimal price) {
        this.id = id;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
