package pl.kodujze.tutorials.microservices.cart;

import java.util.LinkedList;
import java.util.List;

public class Cart {

    private final long userId = 1L;

    private List<Product> products = new LinkedList<>();

    public long getUserId() {
        return userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(long productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public void clear() {
        products = new LinkedList<>();
    }
}
