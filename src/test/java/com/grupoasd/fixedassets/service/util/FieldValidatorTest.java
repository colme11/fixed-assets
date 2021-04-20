package com.grupoasd.fixedassets.service.util;

import com.grupoasd.fixedassets.model.entity.Area;
import com.grupoasd.fixedassets.model.entity.AssetType;
import com.grupoasd.fixedassets.model.entity.Employee;
import com.grupoasd.fixedassets.model.repository.IAreaRepository;
import com.grupoasd.fixedassets.model.repository.IAssetTypeRepository;
import com.grupoasd.fixedassets.model.repository.IEmployeeRepository;
import com.grupoasd.fixedassets.service.dto.AssetDTO;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class FieldValidatorTest {

    @Autowired
    private FieldValidator fieldValidator;

    @Mock
    private IEmployeeRepository employeeRepository;

    @Mock
    private IAreaRepository areaRepository;

    @Mock
    private IAssetTypeRepository assetTypeRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }



    @Test
    void validateEmployee() {
        AssetDTO asset = new AssetDTO();
        asset.setEmployeeId(80119876);

        Optional<Employee> employee = Optional.of(new Employee());
        employee.get().setIdEmployee(80119876);

        Mockito.when(employeeRepository.findByEmployee(asset.getEmployeeId())).thenReturn(employee);

        //test
        ResponseEntity<AssetDTO> httpResponse = fieldValidator.validateEmployee(asset);
        assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
    }

    @Test
    void validateArea() {
        AssetDTO asset = new AssetDTO();
        asset.setAreaId(1);

        Optional<Area> area = Optional.of(new Area());
        area.get().setIdArea(1);

        Mockito.when(areaRepository.findByArea(asset.getAreaId())).thenReturn(area);

        //test
        ResponseEntity<AssetDTO> httpResponse = fieldValidator.validateArea(asset);
        assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
    }

    @Test
    void validateAssetType() {
        AssetDTO asset = new AssetDTO();
        asset.setAssetTypeId(1);

        Optional<AssetType> assetType = Optional.of(new AssetType());
        assetType.get().setIdAssetType(1);

        Mockito.when(assetTypeRepository.findByAssetType(asset.getAssetTypeId())).thenReturn(assetType);

        //test
        ResponseEntity<AssetDTO> httpResponse = fieldValidator.validateAssetType(asset);
        assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
    }
}
