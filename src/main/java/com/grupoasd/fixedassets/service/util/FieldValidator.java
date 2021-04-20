package com.grupoasd.fixedassets.service.util;

import com.grupoasd.fixedassets.service.AreaService;
import com.grupoasd.fixedassets.service.AssetService;
import com.grupoasd.fixedassets.service.AssetTypeService;
import com.grupoasd.fixedassets.service.EmployeeService;
import com.grupoasd.fixedassets.service.dto.AreaDTO;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import com.grupoasd.fixedassets.service.dto.AssetTypeDTO;
import com.grupoasd.fixedassets.service.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FieldValidator {

    @Autowired
    private AssetTypeService assetTypeService;

    @Autowired
    private AreaService areaService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private AssetService assetService;

    /**
     * validate that the fixed asset to update exists in the system and its related data such as type, area and employee
     *
     * @param asset
     * @return
     */
    public ResponseEntity<AssetDTO> validateAssetToUpdate(AssetDTO asset){
        ResponseEntity<AssetDTO> httpResponseFields = validateFields(asset);
        ResponseEntity<AssetDTO> httpResponseAsset = validateAsset(asset);
        if(httpResponseAsset.getStatusCode() != HttpStatus.OK){
            return httpResponseAsset;
        }
        return httpResponseFields;
    }

    /**
     * Validate that the fixed asset is being assigned and the type corresponds to those worked by the company
     *
     * @param asset
     * @return
     */
    public ResponseEntity<AssetDTO> validateFields(AssetDTO asset){
        ResponseEntity<AssetDTO> httpResponseAssignment = validateAssignment(asset);
        ResponseEntity<AssetDTO> httpResponseType = validateAssetType(asset);
        if(httpResponseAssignment.getStatusCode() != HttpStatus.OK){
            return httpResponseAssignment;
        }
        return httpResponseType;
    }

    /**
     * Validate that the fixed asset is being correctly assigned to an area or an employee
     *
     * @param asset
     * @return
     */
    public ResponseEntity<AssetDTO> validateAssignment(AssetDTO asset){
        ResponseEntity<AssetDTO> httpResponseEmployee = validateEmployee(asset);
        ResponseEntity<AssetDTO> httpResponseArea = validateArea(asset);
        if(httpResponseEmployee.getStatusCode() == HttpStatus.OK ||
                httpResponseArea.getStatusCode() == HttpStatus.OK){
            return httpResponseEmployee;
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
    }

    /**
     * Validate that the informed employee belongs to the company
     *
     * @param asset
     * @return
     */
    public ResponseEntity<AssetDTO> validateEmployee(AssetDTO asset){
        if(asset.getEmployeeId()!=null){
            Optional<EmployeeDTO> employee = employeeService.findByEmployee(asset.getEmployeeId());
            if(employee.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body(null);
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    /**
     * Validate that the informed area belongs to the company
     *
     * @param asset
     * @return
     */
    public ResponseEntity<AssetDTO> validateArea(AssetDTO asset){
        if(asset.getAreaId()!=null){
            Optional<AreaDTO> area = areaService.findByArea(asset.getAreaId());
            if(area.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body(null);
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    /**
     * Validate that the informed tipo asset belongs to the company
     *
     * @param asset
     * @return
     */
    public ResponseEntity<AssetDTO> validateAssetType(AssetDTO asset){
        if(asset.getAssetTypeId()!=null){
            Optional<AssetTypeDTO> assetType = assetTypeService.findByAssetType(asset.getAssetTypeId());
            if(assetType.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body(null);
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    /**
     * Validate that the asset to be updated is registered in the system
     *
     * @param asset
     * @return
     */
    public ResponseEntity<AssetDTO> validateAsset(AssetDTO asset){
        if(asset.getId()!=null){
            Optional<AssetDTO> assetResponse = assetService.findByAsset(asset.getId());
            if(assetResponse.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body(null);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
    }


}
