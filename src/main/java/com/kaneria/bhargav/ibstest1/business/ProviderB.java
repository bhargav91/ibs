package com.kaneria.bhargav.ibstest1.business;

import com.kaneria.bhargav.ibstest1.mapper.ProductAMapper;
import com.kaneria.bhargav.ibstest1.mapper.ProductBMapper;
import com.kaneria.bhargav.ibstest1.model.Product;
import com.kaneria.bhargav.ibstest1.model.ProductA;
import com.kaneria.bhargav.ibstest1.model.ProductB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProviderB implements Provider{
    @Autowired
    ProductBMapper productBMapper;
    @Override
    public List<Product> getAllProducts() {
        // Get product
        List<Product> productList = new ArrayList<>();
        List<ProductB> productBList = new ArrayList<>(); // Get from external sources
        for (ProductB productB : productBList) {
            productList.add(productBMapper.map(productB));
        }
        return productList;
    }
}
