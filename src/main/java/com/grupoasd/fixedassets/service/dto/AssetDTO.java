package com.grupoasd.fixedassets.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class AssetDTO {

    @JsonProperty("numero_interno_de_inventario")
    private Integer id;

    @JsonProperty("nombre")
    private String assetName;

    @JsonProperty("descripción")
    private String descriptionAsset;

    @JsonProperty("serial")
    private String assetSerial;

    @JsonProperty("peso")
    private Integer assetWeight;

    @JsonProperty("alto")
    private Integer assetHeight;

    @JsonProperty("ancho")
    private Integer assetWidth;

    @JsonProperty("largo")
    private Integer assetLength;

    @JsonProperty("valor_compra")
    private Double assetPurchaseValue;

    @JsonProperty("fecha_de_compra")
    private LocalDate assetPurchaseDate;

    @JsonProperty("id_tipo")
    private Integer assetTypeId;

    @JsonProperty("tipo")
    private AssetTypeDTO assetTypeOfAssert;

    @JsonProperty("id_area")
    private Integer areaId;

    @JsonProperty("id_empleado")
    private Integer employeeId;

    @JsonProperty("area")
    private AreaDTO assetArea;

    @JsonProperty("empleado")
    private EmployeeDTO employeeAsset;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getDescriptionAsset() {
        return descriptionAsset;
    }

    public void setDescriptionAsset(String descriptionAsset) {
        this.descriptionAsset = descriptionAsset;
    }

    public String getAssetSerial() {
        return assetSerial;
    }

    public void setAssetSerial(String assetSerial) {
        this.assetSerial = assetSerial;
    }

    public Integer getAssetWeight() {
        return assetWeight;
    }

    public void setAssetWeight(Integer assetWeight) {
        this.assetWeight = assetWeight;
    }

    public Integer getAssetHeight() {
        return assetHeight;
    }

    public void setAssetHeight(Integer assetHeight) {
        this.assetHeight = assetHeight;
    }

    public Integer getAssetWidth() {
        return assetWidth;
    }

    public void setAssetWidth(Integer assetWidth) {
        this.assetWidth = assetWidth;
    }

    public Integer getAssetLength() {
        return assetLength;
    }

    public void setAssetLength(Integer assetLength) {
        this.assetLength = assetLength;
    }

    public Double getAssetPurchaseValue() {
        return assetPurchaseValue;
    }

    public void setAssetPurchaseValue(Double assetPurchaseValue) {
        this.assetPurchaseValue = assetPurchaseValue;
    }

    public LocalDate getAssetPurchaseDate() {
        return assetPurchaseDate;
    }

    public void setAssetPurchaseDate(LocalDate assetPurchaseDate) {
        this.assetPurchaseDate = assetPurchaseDate;
    }

    public Integer getAssetTypeId() {
        return assetTypeId;
    }

    public void setAssetTypeId(Integer assetTypeId) {
        this.assetTypeId = assetTypeId;
    }

    public AssetTypeDTO getAssetTypeOfAssert() {
        return assetTypeOfAssert;
    }

    public void setAssetTypeOfAssert(AssetTypeDTO assetTypeOfAssert) {
        this.assetTypeOfAssert = assetTypeOfAssert;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public AreaDTO getAssetArea() {
        return assetArea;
    }

    public void setAssetArea(AreaDTO assetArea) {
        this.assetArea = assetArea;
    }

    public EmployeeDTO getEmployeeAsset() {
        return employeeAsset;
    }

    public void setEmployeeAsset(EmployeeDTO employeeAsset) {
        this.employeeAsset = employeeAsset;
    }
}
