package com.grupoasd.fixedassets.model.repository;

import com.grupoasd.fixedassets.model.crud.AssetTypeCrudRepository;
import com.grupoasd.fixedassets.model.entity.AssetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * This class interacts with the AssetType table of our database
 */
@Repository
public class AssetTypeRepository implements IAssetTypeRepository{

    @Autowired
    private AssetTypeCrudRepository assetTypeCrudRepository;

    @Override
    public Optional<AssetType> findByAssetType(int idAssetType) {
        return assetTypeCrudRepository.findById(idAssetType);
    }
}
