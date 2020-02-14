package com.estimate.estimatebackend.controller;

import com.estimate.estimatebackend.dto.common.WrappedResponseDTO;
import com.estimate.estimatebackend.entity.ProductEntity;
import com.estimate.estimatebackend.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService productService;

    @GetMapping
    public WrappedResponseDTO<List<ProductEntity>> getProducts () {
        return WrappedResponseDTO.success(productService.getProducts());
    }

}
