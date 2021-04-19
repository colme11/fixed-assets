package com.grupoasd.fixedassets.service.dto;

import com.grupoasd.fixedassets.model.entity.Area;
import com.grupoasd.fixedassets.model.entity.AssetType;
import com.grupoasd.fixedassets.model.entity.Employee;

import java.time.LocalDateTime;

public class AssetDTO {

    private Integer id;

    private String assetName;

    private String descriptionAsset;

    private int assetSeries;

    private int assetWeight;

    private int assetHeight;

    private int assetWidth;

    private int assetLength;

    private double assetPurchaseValue;

    private LocalDateTime assetPurchaseDate;

    private Integer assetTypeId;

    private Integer areaId;

    private Integer employeeId;

    private AssetType assetTypeOfAssert;

    private Area assetArea;

    private Employee employeeAsset;

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

    public int getAssetSeries() {
        return assetSeries;
    }

    public void setAssetSeries(int assetSeries) {
        this.assetSeries = assetSeries;
    }

    public int getAssetWeight() {
        return assetWeight;
    }

    public void setAssetWeight(int assetWeight) {
        this.assetWeight = assetWeight;
    }

    public int getAssetHeight() {
        return assetHeight;
    }

    public void setAssetHeight(int assetHeight) {
        this.assetHeight = assetHeight;
    }

    public int getAssetWidth() {
        return assetWidth;
    }

    public void setAssetWidth(int assetWidth) {
        this.assetWidth = assetWidth;
    }

    public int getAssetLength() {
        return assetLength;
    }

    public void setAssetLength(int assetLength) {
        this.assetLength = assetLength;
    }

    public double getAssetPurchaseValue() {
        return assetPurchaseValue;
    }

    public void setAssetPurchaseValue(double assetPurchaseValue) {
        this.assetPurchaseValue = assetPurchaseValue;
    }

    public LocalDateTime getAssetPurchaseDate() {
        return assetPurchaseDate;
    }

    public void setAssetPurchaseDate(LocalDateTime assetPurchaseDate) {
        this.assetPurchaseDate = assetPurchaseDate;
    }

    public Integer getAssetTypeId() {
        return assetTypeId;
    }

    public void setAssetTypeId(Integer assetTypeId) {
        this.assetTypeId = assetTypeId;
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

    public AssetType getAssetTypeOfAssert() {
        return assetTypeOfAssert;
    }

    public void setAssetTypeOfAssert(AssetType assetTypeOfAssert) {
        this.assetTypeOfAssert = assetTypeOfAssert;
    }

    public Area getAssetArea() {
        return assetArea;
    }

    public void setAssetArea(Area assetArea) {
        this.assetArea = assetArea;
    }

    public Employee getEmployeeAsset() {
        return employeeAsset;
    }

    public void setEmployeeAsset(Employee employeeAsset) {
        this.employeeAsset = employeeAsset;
    }
}
