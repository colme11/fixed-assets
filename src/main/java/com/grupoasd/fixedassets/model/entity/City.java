package com.grupoasd.fixedassets.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ciudades")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private Integer idCity;

    @Column(name = "codigo_dane")
    private String codeDane;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_departamento")
    private Integer idDepartment;

    @ManyToOne
    @JoinColumn(name = "id_departamento", insertable = false, updatable = false)
    private Department department;

    @OneToMany(mappedBy = "city")
    private List<Area> areas;

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public String getCodeDane() {
        return codeDane;
    }

    public void setCodeDane(String codeDane) {
        this.codeDane = codeDane;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
}
