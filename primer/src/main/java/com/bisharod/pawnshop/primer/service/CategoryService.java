package com.bisharod.pawnshop.primer.service;

import com.bisharod.pawnshop.primer.model.Category;
import com.bisharod.pawnshop.primer.model.Product;

import java.util.List;

public interface CategoryService {

    public Category addCategory(Category category);
    public List<Category> getCategories();
}
