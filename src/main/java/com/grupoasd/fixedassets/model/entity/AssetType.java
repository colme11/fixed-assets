package com.grupoasd.fixedassets.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "tipo_activos")
public class AssetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_activo")
    private Integer idAssetType;

    @Column(name = "nombre")
    private String name;

    @Column(name = "descripcion")
    private String description;

    @OneToMany(mappedBy = "assetType")
    private List<Asset> assets;
}
