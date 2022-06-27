package com.gestiondestock.dto;

import com.gestiondestock.Models.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String roleNom;

    private UtilisateurDto utilisateur;
}
