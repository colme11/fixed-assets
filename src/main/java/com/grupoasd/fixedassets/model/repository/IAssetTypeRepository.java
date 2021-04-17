package com.grupoasd.fixedassets.model.repository;

import com.grupoasd.fixedassets.model.entity.AssetType;

import java.util.Optional;

public interface IAssetTypeRepository {

    Optional<AssetType> findByAssetType(int idAssetType);
}
