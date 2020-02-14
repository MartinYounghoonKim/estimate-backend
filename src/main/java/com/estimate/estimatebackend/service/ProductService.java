package com.estimate.estimatebackend.service;

import com.estimate.estimatebackend.dto.ProductDTO;
import com.estimate.estimatebackend.entity.Product;
import com.estimate.estimatebackend.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {
    private ProductRepository productRepository;

    @Transactional
    public List<ProductEntity> getProducts () {
        return productRepository.findAll();
    }
}
