package com.example.Gestiondestock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LigneVente")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes vente;

    private BigDecimal quantitie;


}
