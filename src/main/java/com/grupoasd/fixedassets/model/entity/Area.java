package com.grupoasd.fixedassets.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "areas")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area")
    private Integer idArea;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_ciudad")
    private Integer idCity;

    @ManyToOne
    @JoinColumn(name = "id_ciudad", insertable = false, updatable = false)
    private City city;

    @OneToMany(mappedBy = "area")
    private List<Asset> actives;

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Asset> getActives() {
        return actives;
    }

    public void setActives(List<Asset> actives) {
        this.actives = actives;
    }
}
