package com.example.Gestiondestock.dto;

import com.example.Gestiondestock.model.Adresse;
import com.example.Gestiondestock.model.Entreprise;
import com.example.Gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {
    private String nom;

    private String prenom;

    private Instant dateDeNaissance;

    private String moteDePass;

    private Adresse adresse;

    private String photo;

    private Entreprise entreprise;

    private List<Roles> roles;
}
