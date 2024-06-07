package com.kaneria.bhargav.ibstest1.mapper;

import com.kaneria.bhargav.ibstest1.model.Product;
import com.kaneria.bhargav.ibstest1.model.ProductA;
import org.springframework.stereotype.Component;

@Component
public class ProductAMapper {
    public Product map(ProductA productA) {
        Product product = new Product();
        product.setId(productA.getProductId());
        product.setProductName(productA.getProductName());
        product.setId(productA.getProductId());

        return product;
    }
}
