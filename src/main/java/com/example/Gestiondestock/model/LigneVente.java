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
@Table(name = "LigneVente")
public class LigneVente extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes vente;

    @Column(name="sunatitie")
    private BigDecimal quantitie;

    @Column(name="prixunitaire")
    private BigDecimal prixunitaire;
}
