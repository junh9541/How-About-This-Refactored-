package com.HUFS19.backend.dto.product.requestDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductSearchRequest {
    private int categoryId;
    private String type;
    private String search;
}
