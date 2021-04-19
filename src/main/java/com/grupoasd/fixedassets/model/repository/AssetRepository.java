package com.grupoasd.fixedassets.model.repository;

import com.grupoasd.fixedassets.model.crud.AssetCrudRepository;
import com.grupoasd.fixedassets.model.entity.Asset;
import com.grupoasd.fixedassets.model.entity.AssetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * This class interacts with the Asset table of our database
 */
@Repository
public class AssetRepository implements IAssetRepository{

    @Autowired
    private AssetCrudRepository assetCrudRepository;

    @Override
    public List<Asset> getAll() {
        return (List<Asset>) assetCrudRepository.findAll();
    }

    @Override
    public Optional<Asset> findByAsset(int idAsset) {
        return assetCrudRepository.findById(idAsset);
    }

    @Override
    public Asset save(Asset asset) {
        return assetCrudRepository.save(asset);
    }

    @Override
    public List<Asset> assetsByQueryFilter(AssetType activeType, int serial, LocalDateTime date) {
        return assetCrudRepository.findByAssetTypeOrSerialOrDateOfPurchaseOrderBySerial(activeType,serial, date);
    }
}
