package com.grupoasd.fixedassets.service.dto;

import com.grupoasd.fixedassets.model.entity.Area;
import com.grupoasd.fixedassets.model.entity.AssetType;
import com.grupoasd.fixedassets.model.entity.Employee;
import lombok.Data;

import java.time.LocalDateTime;

@Data
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
}
