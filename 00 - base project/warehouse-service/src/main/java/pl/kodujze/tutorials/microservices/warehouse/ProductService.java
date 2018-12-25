package pl.kodujze.tutorials.microservices.warehouse;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

@Service
class ProductService {

    private final ProductRepository productRepository;

    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    Product findById(Long id) {
        return productRepository.findById(id)
            .orElseThrow(EntityNotFoundException::new);
    }

    List<Product> findAll() {
        return productRepository.findAll();
    }
    
    List<Product> findBySearchTerm(String searchTerm) {
        return productRepository.findByNameContainingIgnoreCase(searchTerm);
    }
}
