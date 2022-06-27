package com.gestiondestock.Models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Entity
@Table(name = "fournisseur")
public class Fournissseur extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private Adresse  adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numtel")
    private String numTel;

    @OneToMany(mappedBy = "fournissuer")
    private List<CommandeFournisseur> commandeFournisseurList;


}
