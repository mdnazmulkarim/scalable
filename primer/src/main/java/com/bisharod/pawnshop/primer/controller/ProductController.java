package com.bisharod.pawnshop.primer.controller;

import com.bisharod.pawnshop.primer.model.Product;
import com.bisharod.pawnshop.primer.service.ProductService;
import com.bisharod.pawnshop.primer.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/get-all")
    public List<Product> getProduct() {
        List<Product> productList =  productService.getAllProducts();
        return productList;
    }
    {}
}
