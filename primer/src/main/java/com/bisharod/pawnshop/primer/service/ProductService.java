package com.bisharod.pawnshop.primer.service;

import com.bisharod.pawnshop.primer.model.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);
    public List<Product> getAllProducts();
}
