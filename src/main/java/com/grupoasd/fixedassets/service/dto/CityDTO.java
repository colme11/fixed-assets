package com.grupoasd.fixedassets.service.dto;

import lombok.Data;

@Data
public class CityDTO {

    private Integer id;

    private String codeCity;

    private String nameCity;

    private Integer departmentId;

    private DepartmentDTO departamentCity;
}
