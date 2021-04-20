package com.grupoasd.fixedassets.service;

import com.grupoasd.fixedassets.model.entity.Asset;
import com.grupoasd.fixedassets.model.entity.AssetType;
import com.grupoasd.fixedassets.model.repository.IAssetRepository;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import com.grupoasd.fixedassets.service.dto.AssetTypeDTO;
import com.grupoasd.fixedassets.service.mapper.AssetMapper;
import com.grupoasd.fixedassets.service.mapper.AssetTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AssetService {

    @Autowired
    private IAssetRepository assetRepository;

    @Autowired
    private AssetMapper mapper;

    @Autowired
    private AssetTypeMapper assetTypeMapper;

    public List<AssetDTO> getAll(){
        return mapper.toAssetDtoList(assetRepository.getAll());
    }

    public Optional<AssetDTO> findByAsset(int idAsset){
        return assetRepository.findByAsset(idAsset).map(asset -> mapper.toAssertDto(asset));
    }

    public AssetDTO save(AssetDTO assetDto){
        return mapper.toAssertDto(assetRepository.save(mapper.toAsset(assetDto)));
    }

    public AssetDTO update(AssetDTO assetDto){
        return mapper.toAssertDto(assetRepository.save(mapper.toAsset(assetDto)));
    }

    public List<AssetDTO> assetsByQueryFilter(AssetTypeDTO activeType, String serial, LocalDate date){
        List<Asset> assets = assetRepository.assetsByQueryFilter(assetTypeMapper.toAssetType(activeType),serial, date);
        return mapper.toAssetDtoList(assets);
    }
}
