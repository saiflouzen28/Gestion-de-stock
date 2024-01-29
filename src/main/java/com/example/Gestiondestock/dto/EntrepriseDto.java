package com.example.Gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {
    private String nom;

    private String description;

    private AdresseDto adresse;

    private String codeFiscal;

    private String photo;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;
}
