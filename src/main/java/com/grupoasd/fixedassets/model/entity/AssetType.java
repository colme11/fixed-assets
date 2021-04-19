package com.grupoasd.fixedassets.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
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

    public Integer getIdAssetType() {
        return idAssetType;
    }

    public void setIdAssetType(Integer idAssetType) {
        this.idAssetType = idAssetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}
