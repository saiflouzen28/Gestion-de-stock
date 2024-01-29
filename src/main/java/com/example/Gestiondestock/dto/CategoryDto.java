package com.example.Gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {

    private String code;

    private String designaton;

    private List<ArticleDto> article;
}
