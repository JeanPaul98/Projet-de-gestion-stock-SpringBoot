package com.gestiondestock.dto;

import com.gestiondestock.Models.Fournissseur;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;


@Builder
@Data
public class CommandeFournisseurDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private Fournissseur fournissseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseur;
}
