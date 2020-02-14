package com.estimate.estimatebackend.repository;

import com.estimate.estimatebackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
