package com.gestiondestock.dto;

import com.gestiondestock.Models.Ventes;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private VentesDto ventes;

    private BigDecimal quantite;

    private BigDecimal Unitaire;
}
