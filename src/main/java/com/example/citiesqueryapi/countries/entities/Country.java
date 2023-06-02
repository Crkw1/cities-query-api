package com.example.citiesqueryapi.countries.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity(name = "Country")
@Table(name = "pais")
@Getter
public class Country {
    @Id
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "nome_pt")
    private String portugueseName;
    @Column(name = "sigla")
    private String code;
    private Integer bacen;

}