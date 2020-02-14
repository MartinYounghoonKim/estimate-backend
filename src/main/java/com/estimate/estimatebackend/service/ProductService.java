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
    public ProductDTO createProduct (ProductDTO productDTO) {
        Long id = productRepository.save(productDTO.toEntity()).getId();
        return productDTO.builder()
                .name(productDTO.getName())
                .id(id)
                .rate(productDTO.getRate())
                .build();
    }
    @Transactional
    public List<Product> getProducts () {
        return productRepository.findAll();
    }

    @Transactional
    public Long deleteProduct (Long id) {
        productRepository.deleteById(id);
        return id;
    }
    @Transactional
    public Product updateProduct (Long id, ProductDTO productDTO) {
        Product product = Product.builder()
                .id(id)
                .name(productDTO.getName())
                .rate(productDTO.getRate())
                .build();
        return productRepository.save(product);
    }
}
