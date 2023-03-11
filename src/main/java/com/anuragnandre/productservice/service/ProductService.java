package com.anuragnandre.productservice.service;

import com.anuragnandre.productservice.entity.ProductRequest;
import com.anuragnandre.productservice.entity.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}