package com.estimate.estimatebackend.dto;

import com.estimate.estimatebackend.entity.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Builder
@ToString
@Getter
@Setter
public class ProductDTO {
    private Long id;
    @NotNull(message = "제품의 이름을 입력해주세요.")
    private String name;

    @NotNull(message = "제품의 용량을 입력해주세요.")
    private String rate;

    public Product toEntity () {
        return Product.builder()
                .name(name)
                .rate(rate)
                .build();
    }

}
