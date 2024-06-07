package com.kaneria.bhargav.ibstest1.business;

import com.kaneria.bhargav.ibstest1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    Provider provider;

    public List<Product> getAllProducts() {
        // Provider will be injected from ProviderBeanConfiguration class based on the provider set in application.properties file
        return provider.getAllProducts();
    }
}

