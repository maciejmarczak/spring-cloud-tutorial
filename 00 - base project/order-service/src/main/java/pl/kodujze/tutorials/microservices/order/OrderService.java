package pl.kodujze.tutorials.microservices.order;

import org.springframework.stereotype.Service;

@Service
class OrderService {

    private final CartService cartService;

    OrderService(CartService cartService) {
        this.cartService = cartService;
    }

    void placeOrder() {
        final Cart cart = cartService.getCart();

        // process cart and place order

        cartService.clearCart();
    }
}
