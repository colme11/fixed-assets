package com.grupoasd.fixedassets.model.crud;

import com.grupoasd.fixedassets.model.entity.Asset;
import com.grupoasd.fixedassets.model.entity.AssetType;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.time.LocalDateTime;

public interface AssetCrudRepository extends CrudRepository<Asset, Integer> {

    List<Asset> findByAssetTypeOrSerialOrDateOfPurchaseOrderBySerial(AssetType assetType, int serial, LocalDateTime fecha);
}
