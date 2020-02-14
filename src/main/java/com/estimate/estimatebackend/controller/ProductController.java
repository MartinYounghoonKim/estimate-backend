package com.estimate.estimatebackend.controller;

import com.estimate.estimatebackend.dto.ProductDTO;
import com.estimate.estimatebackend.dto.common.WrappedResponseDTO;
import com.estimate.estimatebackend.entity.Product;
import com.estimate.estimatebackend.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService productService;

    @GetMapping
    public WrappedResponseDTO<List<Product>> getProducts () {
        return WrappedResponseDTO.success(productService.getProducts());
    }

}
