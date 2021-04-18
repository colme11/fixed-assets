package com.grupoasd.fixedassets.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
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
}
