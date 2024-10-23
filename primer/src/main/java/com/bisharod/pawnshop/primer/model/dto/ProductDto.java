package com.bisharod.pawnshop.primer.model.dto;

import com.bisharod.pawnshop.primer.model.Category;
import com.bisharod.pawnshop.primer.model.Product;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class ProductDto {

    private Long id;
    private String name;

    private String description;
    private Long categoryId;

    public Product getProduct(Category category) {
        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setDescription(description);
        newProduct.setCategory(category);
        return newProduct;
    }
}
