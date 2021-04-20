package com.grupoasd.fixedassets.service.mapper;

import com.grupoasd.fixedassets.model.entity.Asset;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AssetTypeMapper.class, AreaMapper.class, EmployeeMapper.class})
public interface AssetMapper {

    @Mappings({
            @Mapping(source = "idAsset", target = "id"),
            @Mapping(source = "name", target = "assetName"),
            @Mapping(source = "descripcion", target = "descriptionAsset"),
            @Mapping(source = "serial", target = "assetSerial"),
            @Mapping(source = "weight", target = "assetWeight"),
            @Mapping(source = "high", target = "assetHeight"),
            @Mapping(source = "width", target = "assetWidth"),
            @Mapping(source = "longAsset", target = "assetLength"),
            @Mapping(source = "valueOfPurchase", target = "assetPurchaseValue"),
            @Mapping(source = "dateOfPurchase", target = "assetPurchaseDate"),
            @Mapping(source = "idAssetType", target = "assetTypeId"),
            @Mapping(source = "idArea", target = "areaId"),
            @Mapping(source = "idEmployee", target = "employeeId"),
            @Mapping(source = "assetType", target = "assetTypeOfAssert"),
            @Mapping(source = "area", target = "assetArea"),
            @Mapping(source = "employee", target = "employeeAsset"),
    })
    AssetDTO toAssertDto(Asset asset);

    List<AssetDTO> toAssetDtoList(List<Asset> assetList);

    @InheritInverseConfiguration
    Asset toAsset(AssetDTO assetDTO);
}
