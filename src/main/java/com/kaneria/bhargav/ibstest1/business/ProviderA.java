package com.kaneria.bhargav.ibstest1.business;

import com.kaneria.bhargav.ibstest1.model.Product;
import com.kaneria.bhargav.ibstest1.model.ProductA;
import com.kaneria.bhargav.ibstest1.mapper.ProductAMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProviderA implements Provider {
    @Autowired
    ProductAMapper productAMapper;
    @Override
    public List<Product> getAllProducts() {
        // Get product
        List<Product> productList = new ArrayList<>();
        List<ProductA> productAList = new ArrayList<>(); // Get from external sources
        for (ProductA productA : productAList) {
            productList.add(productAMapper.map(productA));
        }
        return productList;
    }
}
