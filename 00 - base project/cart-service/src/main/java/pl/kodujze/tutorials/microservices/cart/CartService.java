package pl.kodujze.tutorials.microservices.cart;

import org.springframework.stereotype.Service;

@Service
class CartService {

    private final Cart cart = new Cart();

    Cart getCart() {
        return cart;
    }

    void addProductToCart(Product product) {
        cart.addProduct(product);
    }

    void removeProductFromCart(long productId) {
        cart.removeProduct(productId);
    }

    void clearCart() {
        cart.clear();
    }
}
