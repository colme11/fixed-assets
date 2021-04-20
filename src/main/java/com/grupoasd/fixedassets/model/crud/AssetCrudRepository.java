package com.grupoasd.fixedassets.model.crud;

import com.grupoasd.fixedassets.model.entity.Asset;
import com.grupoasd.fixedassets.model.entity.AssetType;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface AssetCrudRepository extends CrudRepository<Asset, Integer> {

    List<Asset> findByAssetTypeAndSerialAndDateOfPurchaseOrderBySerial(AssetType assetType, String serial, LocalDate date);
}
