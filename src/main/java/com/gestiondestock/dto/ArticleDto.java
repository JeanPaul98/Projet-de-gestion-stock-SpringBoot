package com.gestiondestock.dto;

import com.gestiondestock.Models.Categorie;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixunitaireTtc;

    private String photo;

    private CategorieDto categorie;
}
