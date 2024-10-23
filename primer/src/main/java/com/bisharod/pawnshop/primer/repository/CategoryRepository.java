package com.bisharod.pawnshop.primer.repository;

import com.bisharod.pawnshop.primer.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
