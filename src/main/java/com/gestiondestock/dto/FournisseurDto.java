package com.gestiondestock.dto;
import com.gestiondestock.Models.Adresse;
import com.gestiondestock.Models.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurList;
}
