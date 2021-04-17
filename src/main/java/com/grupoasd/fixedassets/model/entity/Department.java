package com.grupoasd.fixedassets.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
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
}
