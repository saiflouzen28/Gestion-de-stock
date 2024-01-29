package com.example.Gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.time.Instant;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class Utilisateur extends AbstractEntity {

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="datedenaissance")
    private Instant dateDeNaissance;

    @Column(name="motdepass")
    private String moteDePass;

    @Embedded
    private Adresse adresse;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="identreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;

}
