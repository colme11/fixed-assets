package com.grupoasd.fixedassets.controller;

import com.grupoasd.fixedassets.service.AssetService;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import com.grupoasd.fixedassets.service.util.FieldValidator;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation("Get all fixed assets of the company")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<AssetDTO>> getAll(){
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
        ResponseEntity<AssetDTO> httpResponseValidate = fieldValidator.validateFields(assetDTO);
        if(httpResponseValidate.getStatusCode() == HttpStatus.OK){
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
        ResponseEntity<AssetDTO> httpResponseValidate = fieldValidator.validateAssetToUpdate(assetDTO);
        if(httpResponseValidate.getStatusCode() == HttpStatus.OK){
            return new ResponseEntity<>(assetService.update(assetDTO), HttpStatus.OK);
        }
        return httpResponseValidate;
    }

    @GetMapping("/asset")
    @ApiOperation("Fixed assets by query parameters")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<AssetDTO>> assetFilter(@RequestParam("tipo") int tipo, @RequestParam("serial") String serial, @RequestParam("fecha_compra") String fecha) {
        return new ResponseEntity<>(assetService.assetsByQueryFilter(tipo, serial, fecha), HttpStatus.OK);
    }

}
