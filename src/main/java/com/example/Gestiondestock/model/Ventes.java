package com.example.Gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Ventes")
public class Ventes extends AbstractEntity{
    @Column(name="code")
    private String code;

    @Column(name="datevente")
    private Instant dateVente;

    @Column(name="commentaire")
    private String commentaire;
}
