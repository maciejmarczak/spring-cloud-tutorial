package pl.kodujze.tutorials.microservices.order;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cart {

    private final long userId;

    private final List<Product> products;

    @JsonCreator
    public Cart(@JsonProperty("userId") long userId,
                @JsonProperty("products") List<Product> products) {
        this.userId = userId;
        this.products = products;
    }

    public long getUserId() {
        return userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static class Product {

        private final long id;

        private final BigDecimal price;

        @JsonCreator
        public Product(@JsonProperty("id") long id,
                       @JsonProperty("price") BigDecimal price) {
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
}
