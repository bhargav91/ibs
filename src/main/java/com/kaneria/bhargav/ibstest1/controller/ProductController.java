package com.kaneria.bhargav.ibstest1.controller;


import com.kaneria.bhargav.ibstest1.model.Product;
import com.kaneria.bhargav.ibstest1.business.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/getAllProducts", produces =
            MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getService() {
        return productService.getAllProducts();
    }
}
