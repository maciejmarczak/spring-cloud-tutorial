package pl.kodujze.tutorials.microservices.order;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
class CartService {

    private static final String URL = "http://localhost:8040/cart";

    private final RestTemplate restTemplate = new RestTemplate();

    Cart getCart() {
        return restTemplate.getForObject(URL, Cart.class);
    }

    void clearCart() {
        restTemplate.postForEntity(URL + "/clear", null, Void.class);
    }
}
