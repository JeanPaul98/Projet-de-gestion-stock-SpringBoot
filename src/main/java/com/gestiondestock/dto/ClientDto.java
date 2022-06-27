package com.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondestock.Models.Adresse;
import com.gestiondestock.Models.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String mail;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;
}
