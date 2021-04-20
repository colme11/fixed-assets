package com.grupoasd.fixedassets.model.repository;

import com.grupoasd.fixedassets.model.entity.Asset;
import com.grupoasd.fixedassets.model.entity.AssetType;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IAssetRepository {

    List<Asset> getAll();

    Optional<Asset> findByAsset(int idAsset);

    Asset save(Asset asset);

    List<Asset> assetsByQueryFilter(AssetType activeType, String serial, LocalDate date);
}
