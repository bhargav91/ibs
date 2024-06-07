package com.kaneria.bhargav.ibstest1.mapper;

import com.kaneria.bhargav.ibstest1.model.Product;
import com.kaneria.bhargav.ibstest1.model.ProductB;

public class ProductBMapper {
    public Product map(ProductB productB) {
        Product product = new Product();
        product.setId(productB.getId());
        product.setProductName(productB.getName());
        product.setId(productB.getContent());
        return product;
    }
}
