package com.gestiondestock.dto;

import com.gestiondestock.Models.Client;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private Client client;

    private List<LigneCommandeClientDto> lignecommandeclients;
}
