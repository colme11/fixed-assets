package com.grupoasd.fixedassets.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departamentos")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Integer idDepartment;

    @Column(name = "codigo_dane")
    private String codeDane;

    @Column(name = "nombre")
    private String name;

    @OneToMany(mappedBy = "department")
    private List<City> citys;

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
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

    public List<City> getCitys() {
        return citys;
    }

    public void setCitys(List<City> citys) {
        this.citys = citys;
    }
}
