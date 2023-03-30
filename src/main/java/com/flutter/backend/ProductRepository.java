package com.flutter.backend;



import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByEmail(String email); //find by Property ?Operator? A: Where is findByNameContaining declared?        
    }

