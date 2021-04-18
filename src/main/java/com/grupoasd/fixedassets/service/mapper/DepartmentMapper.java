package com.grupoasd.fixedassets.service.mapper;

import com.grupoasd.fixedassets.model.entity.Department;
import com.grupoasd.fixedassets.service.dto.DepartmentDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    @Mappings({
            @Mapping(source = "idDepartment", target = "id"),
            @Mapping(source = "codeDane", target = "codeDepartment"),
            @Mapping(source = "name", target = "nameDepartment"),
    })
    DepartmentDTO toCaDepartmentDto(Department department);

    @InheritInverseConfiguration
    @Mapping(target = "citys", ignore = true)
    Department toDepartment(DepartmentDTO departmentDTO);
}
