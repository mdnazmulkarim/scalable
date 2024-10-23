package com.bisharod.pawnshop.primer.service.impl;

import com.bisharod.pawnshop.primer.model.Product;
import com.bisharod.pawnshop.primer.repository.CategoryRepository;
import com.bisharod.pawnshop.primer.repository.ProductRepository;
import com.bisharod.pawnshop.primer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        try{
            Product pro = productRepository.save(product);
            return pro;
        } catch(Exception e) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED, "Could not add new product");
        }
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
