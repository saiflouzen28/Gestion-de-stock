package com.example.Gestiondestock.model;

import jakarta.persistence.*;
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
@Table(name = "Entreprise")
public class Entreprise extends AbstractEntity{

    @Column(name="nom")
    private String nom;

    @Column(name="description")
    private String description;

    @Embedded
    private Adresse adresse;

    @Column(name="codefiscal")
    private String codeFiscal;

    @Column(name="photo")
    private String photo;

    @Column(name="numTel")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;
}
