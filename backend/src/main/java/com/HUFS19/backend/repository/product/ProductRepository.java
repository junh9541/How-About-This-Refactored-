package com.HUFS19.backend.repository.product;

import com.HUFS19.backend.dto.product.ProductDetailDto;
import com.HUFS19.backend.dto.product.ProductPrevDto;
import com.HUFS19.backend.dto.product.ProductSummary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {
    int save(Product product);
    //구현 필요
//    List<Product> findByCategory(int categoryId);
    List<Product> findAll(int categoryId);

    Optional<ProductDetailDto> findById(int productId);

    List<ProductPrevDto> searchProduct(String keyword, String searchOption, int categoryId);

    List<ProductDetailDto> findByUserId(String userId);

    List<ProductPrevDto> findCategoryProducts(int categoryId);
}
