package com.grupoasd.fixedassets.service;

import com.grupoasd.fixedassets.model.entity.Asset;
import com.grupoasd.fixedassets.model.entity.AssetType;
import com.grupoasd.fixedassets.model.repository.IAssetRepository;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import com.grupoasd.fixedassets.service.mapper.AssetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AssetService {

    @Autowired
    private IAssetRepository assetRepository;

    @Autowired
    private AssetMapper mapper;

    List<AssetDTO> getAll(){
        return mapper.toAssetDtoList(assetRepository.getAll());
    }

    Optional<AssetDTO> findByAsset(int idAsset){
        return assetRepository.findByAsset(idAsset).map(asset -> mapper.toAssertDto(asset));
    }

    AssetDTO save(AssetDTO assetDto){
        return mapper.toAssertDto(assetRepository.save(mapper.toAsset(assetDto)));
    }

    List<AssetDTO> assetsByQueryFilter(AssetType activeType, int serial, LocalDateTime date){
        List<Asset> assets = assetRepository.assetsByQueryFilter(activeType,serial, date);
        return mapper.toAssetDtoList(assets);
    }
}
