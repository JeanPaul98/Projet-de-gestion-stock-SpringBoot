package com.gestiondestock.dto;

import com.gestiondestock.Models.Adresse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data@Builder
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private Adresse adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    private List<UtilisateurDto> utilisateurs;
}
