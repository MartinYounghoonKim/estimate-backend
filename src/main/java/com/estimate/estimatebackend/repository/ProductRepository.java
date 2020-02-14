package com.estimate.estimatebackend.repository;

import com.estimate.estimatebackend.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
