package com.grupoasd.fixedassets.service.mapper;

import com.grupoasd.fixedassets.model.entity.Employee;
import com.grupoasd.fixedassets.service.dto.EmployeeDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mappings({
            @Mapping(source = "idEmployee", target = "id"),
            @Mapping(source = "firstName", target = "firstNameEmployee"),
            @Mapping(source = "secondName", target = "secondNameEmployee"),
            @Mapping(source = "firstLastname", target = "firstLastnameEmployee"),
            @Mapping(source = "secondLastname", target = "secondLastnameEmployee"),
            @Mapping(source = "phoneNumber", target = "phoneNumberEmployee"),
            @Mapping(source = "cellNumber", target = "cellNumberEmployee"),
            @Mapping(source = "email", target = "emailEmployee"),
    })
    EmployeeDTO toEmployeeDto(Employee employee);

    @InheritInverseConfiguration
    @Mapping(target = "assets", ignore = true)
    Employee toEmployee(EmployeeDTO employeeDTO);
}
