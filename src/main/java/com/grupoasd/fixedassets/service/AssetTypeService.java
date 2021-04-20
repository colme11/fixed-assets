package com.grupoasd.fixedassets.service;

import com.grupoasd.fixedassets.model.repository.IAssetTypeRepository;
import com.grupoasd.fixedassets.service.dto.AssetTypeDTO;
import com.grupoasd.fixedassets.service.mapper.AssetTypeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssetTypeService {

    private static final Logger logger = LoggerFactory.getLogger(AssetTypeService.class);

    @Autowired
    private IAssetTypeRepository assetTypeRepository;

    @Autowired
    private AssetTypeMapper mapper;

    /**
     * Query an asset type for id
     *
     * @param idAssetType
     * @return
     */
    public Optional<AssetTypeDTO> findByAssetType(int idAssetType){
        logger.info("AssetTypeService.findByAssetType() - Query asset type by its id");
        return assetTypeRepository.findByAssetType(idAssetType).map(assetType -> mapper.toAssetTypeDto(assetType));
    }
}
