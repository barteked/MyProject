package com.example.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Wyszukiwanie produktów po nazwie
    Product findByName(String name);

    // Wyszukiwanie produktów w przedziale cenowym
    List<Product> findByPriceBetween(double minPrice, double maxPrice);

}
