package com.grupoasd.fixedassets.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DepartmentDTO {

    @JsonIgnore
    private Integer id;

    @JsonProperty("codigo_dane")
    private String codeDepartment;

    @JsonProperty("nombre")
    private String nameDepartment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeDepartment() {
        return codeDepartment;
    }

    public void setCodeDepartment(String codeDepartment) {
        this.codeDepartment = codeDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
}
