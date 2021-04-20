package com.grupoasd.fixedassets.service;

import com.grupoasd.fixedassets.model.entity.Asset;
import com.grupoasd.fixedassets.model.repository.IAssetRepository;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import com.grupoasd.fixedassets.service.dto.AssetTypeDTO;
import com.grupoasd.fixedassets.service.mapper.AssetMapper;
import com.grupoasd.fixedassets.service.mapper.AssetTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class AssetService {

    @Autowired
    private IAssetRepository assetRepository;

    @Autowired
    private AssetTypeService assetTypeService;

    @Autowired
    private AssetMapper mapper;

    @Autowired
    private AssetTypeMapper assetTypeMapper;

    /**
     * query all fixed assets of the company
     *
     * @return
     */
    public List<AssetDTO> getAll(){
        return mapper.toAssetDtoList(assetRepository.getAll());
    }

    /**
     * query all fixed assets
     *
     * @param idAsset
     * @return
     */
    public Optional<AssetDTO> findByAsset(int idAsset){
        return assetRepository.findByAsset(idAsset).map(asset -> mapper.toAssertDto(asset));
    }

    /**
     * register a new fixed asset
     *
     * @param assetDto
     * @return
     */
    public AssetDTO save(AssetDTO assetDto){
        return mapper.toAssertDto(assetRepository.save(mapper.toAsset(assetDto)));
    }

    /**
     * updates the information of a fixed asset
     *
     * @param assetDto
     * @return
     */
    public AssetDTO update(AssetDTO assetDto){
        return mapper.toAssertDto(assetRepository.save(mapper.toAsset(assetDto)));
    }

    /**
     * query a fixed asset by query parameters
     *
     * @param tipo
     * @param serial
     * @param date
     * @return
     */
    public List<AssetDTO> assetsByQueryFilter(int tipo, String serial, String date){
        Optional<AssetTypeDTO> assetType = assetTypeService.findByAssetType(tipo);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        List<Asset> assets = assetRepository.assetsByQueryFilter(assetTypeMapper.toAssetType(assetType.get()),serial, localDate);
        return mapper.toAssetDtoList(assets);
    }
}
