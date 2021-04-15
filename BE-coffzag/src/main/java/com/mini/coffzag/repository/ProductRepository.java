package com.mini.coffzag.repository;

import com.mini.coffzag.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
    Optional<Product> findByCoffeeId(Long coffeeId);
    List<Product> findByCoffeeBrand(String brand);
    List<Product> findAllByOrderByCoffeePriceAsc();
}
