package com.example.citiesqueryapi.cities.entities;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import java.awt.*;

@Entity
@Table(name = "cidade")
@Getter
@AllArgsConstructor
/*@TypeDefs({
    @TypeDef(name = "point", typeClass = PointType.class)
})*/
public class City {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  private Integer uf;

  private Integer ibge;

  // 1st
  @Column(name = "lat_lon")
  private String geolocation;

  // 2nd
 /* @Type(type = "point")
  @Column(name = "lat_lon", updatable = false, insertable = false)
  private Point location;*/

  public City() {
  }

  /*public City(final Long id, final String name, final Integer uf, final Integer ibge,
              final String geolocation, final Point location) {
    this.id = id;
    this.name = name;
    this.uf = uf;
    this.ibge = ibge;
    this.geolocation = geolocation;
    this.location = location;

  }*/

}