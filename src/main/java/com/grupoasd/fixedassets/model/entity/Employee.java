package com.grupoasd.fixedassets.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "empleados")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cedula")
    private Integer idEmployee;

    @Column(name = "primer_nombre")
    private String firstName;

    @Column(name = "segundo_nombre")
    private String secondName;

    @Column(name = "primer_apellido")
    private String firstLastname;

    @Column(name = "segundo_apellido")
    private String secondLastname;

    @Column(name = "numero_telefono")
    private String phoneNumber;

    @Column(name = "numero_celular")
    private String cellNumber;

    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(mappedBy = "employee")
    private List<Asset> assets;
}
