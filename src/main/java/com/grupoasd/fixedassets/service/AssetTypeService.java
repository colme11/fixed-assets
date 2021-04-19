package com.grupoasd.fixedassets.service;

import com.grupoasd.fixedassets.model.repository.IAssetTypeRepository;
import com.grupoasd.fixedassets.service.dto.AssetTypeDTO;
import com.grupoasd.fixedassets.service.mapper.AssetTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssetTypeService {

    @Autowired
    private IAssetTypeRepository assetTypeRepository;

    @Autowired
    private AssetTypeMapper mapper;

    public Optional<AssetTypeDTO> findByAssetType(int idAssetType){
        return assetTypeRepository.findByAssetType(idAssetType).map(assetType -> mapper.toAssetTypeDto(assetType));
    }
}
