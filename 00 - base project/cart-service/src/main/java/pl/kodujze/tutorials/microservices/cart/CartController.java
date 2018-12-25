package pl.kodujze.tutorials.microservices.cart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public Cart getCart() {
        return cartService.getCart();
    }

    @PostMapping("/products")
    public void addProductToCart(@RequestBody Product product) {
        cartService.addProductToCart(product);
    }

    @DeleteMapping("/products/{productId}")
    public void removeProductFromCart(@PathVariable long productId) {
        cartService.removeProductFromCart(productId);
    }
    
    @PostMapping("/clear")
    public void clearCart() {
        cartService.clearCart();
    }
}
