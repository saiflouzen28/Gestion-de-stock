package com.example.Gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Category")
public class Category extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name="designation")
    private String designaton;

    @OneToMany(mappedBy="category")
    private List<Article> article;
}
