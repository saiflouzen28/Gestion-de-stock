package com.example.Gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private VentesDto vente;

    private BigDecimal quantitie;

    private BigDecimal prixunitaire;
}
