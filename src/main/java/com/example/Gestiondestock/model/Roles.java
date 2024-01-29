package com.example.Gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Roles")
public class Roles extends AbstractEntity{

    @Column(name="rolename")
    private String roleName;

    @ManyToOne
    @JoinColumn(name="idutilisateur")
    private Utilisateur utilisateur;
}
