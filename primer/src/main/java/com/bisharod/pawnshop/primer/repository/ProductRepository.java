package com.bisharod.pawnshop.primer.repository;

import com.bisharod.pawnshop.primer.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
