package com.grupoasd.fixedassets.controller;

import com.grupoasd.fixedassets.service.AssetService;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import com.grupoasd.fixedassets.service.util.FieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetController {

    @Autowired
    private AssetService assetService;

    @Autowired
    private FieldValidator fieldValidator;


    @GetMapping("/assets")
    public ResponseEntity<List<AssetDTO>> getAll(){
        return new ResponseEntity<>(assetService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/asset")
    public ResponseEntity<AssetDTO> save(@RequestBody AssetDTO assetDTO){
        ResponseEntity<AssetDTO> httpResponseValidate = fieldValidator.validateFields(assetDTO);
        if(httpResponseValidate.getStatusCode() == HttpStatus.OK){
            return new ResponseEntity<>(assetService.save(assetDTO), HttpStatus.CREATED);
        }
        return httpResponseValidate;
    }

    @PutMapping("/asset")
    public ResponseEntity<AssetDTO> update(@RequestBody AssetDTO assetDTO) {
        ResponseEntity<AssetDTO> httpResponseValidate = fieldValidator.validateAssetToUpdate(assetDTO);
        if(httpResponseValidate.getStatusCode() == HttpStatus.OK){
            return new ResponseEntity<>(assetService.update(assetDTO), HttpStatus.OK);
        }
        return httpResponseValidate;
    }

    @GetMapping("/asset")
    public ResponseEntity<List<AssetDTO>> assetFilter(@RequestParam("tipo") int tipo, @RequestParam("serial") String serial, @RequestParam("fecha_compra") String fecha) {
        return new ResponseEntity<>(assetService.assetsByQueryFilter(tipo, serial, fecha), HttpStatus.OK);
    }

}
