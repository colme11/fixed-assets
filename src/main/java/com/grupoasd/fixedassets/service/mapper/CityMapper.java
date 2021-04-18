package com.grupoasd.fixedassets.service.mapper;

import com.grupoasd.fixedassets.model.entity.City;
import com.grupoasd.fixedassets.service.dto.CityDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DepartmentMapper.class})
public interface CityMapper {

    @Mappings({
            @Mapping(source = "idCity", target = "id"),
            @Mapping(source = "codeDane", target = "codeCity"),
            @Mapping(source = "name", target = "nameCity"),
            @Mapping(source = "idDepartment", target = "departmentId"),
            @Mapping(source = "department", target = "departamentCity"),
    })
    CityDTO toCityDto(City city);

    List<CityDTO> toCityDtoList(List<City> cityList);

    @InheritInverseConfiguration
    @Mapping(target = "areas", ignore = true)
    City toCity(CityDTO cityDTO);
}
