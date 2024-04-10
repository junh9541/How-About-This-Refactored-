package com.HUFS19.backend.repository.userLike;

import com.HUFS19.backend.dto.product.ProductDetailDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserLikeRepository {
    List<ProductDetailDto> getLikedProduct(String userId);

    Optional<UserLike> getProductLikeStatus(int productId, String userId);
}
