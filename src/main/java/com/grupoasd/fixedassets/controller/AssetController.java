package com.grupoasd.fixedassets.controller;

import com.grupoasd.fixedassets.service.AssetService;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import com.grupoasd.fixedassets.service.util.FieldValidator;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetController {

    private static final Logger logger = LoggerFactory.getLogger(AssetController.class);

    @Autowired
    private AssetService assetService;

    @Autowired
    private FieldValidator fieldValidator;


    @GetMapping("/assets")
    @ApiOperation("Get all fixed assets of the company")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<AssetDTO>> getAll(){
        logger.info("AssetController.getAll() - Start the query of all the assets of the company");
        return new ResponseEntity<>(assetService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/asset")
    @ApiOperation("Create fixed asset in the system")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Fixed asset created"),
            @ApiResponse(code = 400, message = "Validate area, employee or type - Bad Request"),
            @ApiResponse(code = 409, message = "Fixed asset was not assigned"),
    })
    public ResponseEntity<AssetDTO> save(@RequestBody AssetDTO assetDTO){
        logger.info("AssetController.save() - Validate parameters, type, area y employee");
        ResponseEntity<AssetDTO> httpResponseValidate = fieldValidator.validateFields(assetDTO);
        if(httpResponseValidate.getStatusCode() == HttpStatus.OK){
            logger.info("AssetController.save() - The asset is registered in the system");
            return new ResponseEntity<>(assetService.save(assetDTO), HttpStatus.CREATED);
        }
        return httpResponseValidate;
    }

    @PutMapping("/asset")
    @ApiOperation("Create fixed asset in the system")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Updated fixed asset"),
            @ApiResponse(code = 400, message = "Validate area, employee or type - Bad Request"),
            @ApiResponse(code = 409, message = "Fixed asset was not assigned"),
    })
    public ResponseEntity<AssetDTO> update(@RequestBody AssetDTO assetDTO) {
        logger.info("AssetController.update() - Validate parameters, type, area y employee");
        ResponseEntity<AssetDTO> httpResponseValidate = fieldValidator.validateAssetToUpdate(assetDTO);
        if(httpResponseValidate.getStatusCode() == HttpStatus.OK){
            logger.info("AssetController.update() - The asset is updated in the system");
            return new ResponseEntity<>(assetService.update(assetDTO), HttpStatus.OK);
        }
        return httpResponseValidate;
    }

    @GetMapping("/asset")
    @ApiOperation("Fixed assets by query parameters")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<AssetDTO>> assetFilter(@RequestParam("tipo") int tipo, @RequestParam("serial") String serial, @RequestParam("fecha_compra") String fecha) {
        logger.info("AssetController.assetFilter() - We consult fixed assets according to query parameters");
        return new ResponseEntity<>(assetService.assetsByQueryFilter(tipo, serial, fecha), HttpStatus.OK);
    }

}
