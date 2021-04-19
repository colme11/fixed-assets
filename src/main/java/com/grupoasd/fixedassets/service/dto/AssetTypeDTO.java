package com.grupoasd.fixedassets.service.dto;

public class AssetTypeDTO {

    private Integer id;

    private String nameAssetType;

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
