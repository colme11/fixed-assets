package com.grupoasd.fixedassets.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
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
}
