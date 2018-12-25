package pl.kodujze.tutorials.microservices.warehouse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingIgnoreCase(String searchTerm);
}
