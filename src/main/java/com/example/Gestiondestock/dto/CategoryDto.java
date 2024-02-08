package com.example.Gestiondestock.dto;

import com.example.Gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {

    private Integer id;

    private String code;

    private String designaton;

    private List<ArticleDto> article;

    public CategoryDto fromEntity(Category category){
        if (category ==null){
            return null;
        }
        return Category.builder()
                .id(category.getId())
                .code(category.getCode())
                .designaton(category.getDesignaton())
    }
}
m