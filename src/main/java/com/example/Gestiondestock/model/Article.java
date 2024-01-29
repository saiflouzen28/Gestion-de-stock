package com.example.Gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Article")
public class Article extends AbstractEntity{
    @Column(name="codearticle")
    private String codeArticle;

    @Column(name="designation")
    private String designation;

    @Column(name="prixunitaireht")
    private BigDecimal prixUnitairht;

    @Column(name="tauxtva")
    private BigDecimal tauTva;

    @Column(name= "prixunitairettc")
    private BigDecimal prixUnitaireTtc;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="idcategory")
    private Category category;


}
