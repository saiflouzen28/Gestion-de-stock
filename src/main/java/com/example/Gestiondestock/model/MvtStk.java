package com.example.Gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MvtStk")
public class MvtStk extends AbstractEntity {

    @Column(name="datemve")
    private Instant dateMvt;

    @Column(name="quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;

    @Column(name="typeMvt")
    private TypeMvtStk typeMvt;


}
