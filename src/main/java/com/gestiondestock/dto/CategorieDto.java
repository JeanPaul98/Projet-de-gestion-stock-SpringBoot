package com.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondestock.Models.Categorie;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategorieDto {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public CategorieDto fromEntity(Categorie categorie){
        if (categorie == null){
            return null;
            //TODO throw on exception
        }
        return  CategorieDto.builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .build();
    }

    public Categorie toEntity(CategorieDto categorieDto){
        if (categorieDto == null){
            return null;
            //TODO throw on exception
        }
        return Categorie.builder()
                .code(categorieDto.getCode())
                .designation(categorieDto.getDesignation())
                .build();
    }
}
