package com.grupoasd.fixedassets.service.mapper;

import com.grupoasd.fixedassets.model.entity.AssetType;
import com.grupoasd.fixedassets.service.dto.AssetTypeDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AssetTypeMapper {

    @Mappings({
            @Mapping(source = "idAssetType", target = "id"),
            @Mapping(source = "name", target = "nameAssetType"),
            @Mapping(source = "description", target = "descriptionAssetType"),
    })
    AssetTypeDTO toAssetTypeDto(AssetType assetType);

    @InheritInverseConfiguration
    @Mapping(target = "assets", ignore = true)
    AssetType toAssetType(AssetTypeDTO assetTypeDTO);
}
