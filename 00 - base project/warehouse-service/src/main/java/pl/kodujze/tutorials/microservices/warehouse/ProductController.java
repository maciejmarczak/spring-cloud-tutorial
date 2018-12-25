package pl.kodujze.tutorials.microservices.warehouse;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public Product findById(@PathVariable("id") Long id) {
        return productService.findById(id);
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping(params = "searchTerm")
    public List<Product> findBySearchTerm(@RequestParam String searchTerm) {
        return productService.findBySearchTerm(searchTerm);
    }
}
