package com.example.Gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Fournisseur")
public class Fournisseur extends AbstractEntity {
    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    //private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name="mail")
    private String mail;

    @Column(name="numTel")
    private String numTel;

    @OneToMany(mappedBy= "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;

}
