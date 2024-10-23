package com.bisharod.pawnshop.primer.service.impl;

import com.bisharod.pawnshop.primer.model.Category;
import com.bisharod.pawnshop.primer.repository.CategoryRepository;
import com.bisharod.pawnshop.primer.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

}
