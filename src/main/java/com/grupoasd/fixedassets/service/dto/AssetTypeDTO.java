package com.grupoasd.fixedassets.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AssetTypeDTO {

    @JsonIgnore
    private Integer id;

    @JsonProperty("nombre")
    private String nameAssetType;

    @JsonProperty("descripción")
    private String descriptionAssetType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAssetType() {
        return nameAssetType;
    }

    public void setNameAssetType(String nameAssetType) {
        this.nameAssetType = nameAssetType;
    }

    public String getDescriptionAssetType() {
        return descriptionAssetType;
    }

    public void setDescriptionAssetType(String descriptionAssetType) {
        this.descriptionAssetType = descriptionAssetType;
    }
}
