package com.grupoasd.fixedassets.service.dto;

public class CityDTO {

    private Integer id;

    private String codeCity;

    private String nameCity;

    private Integer departmentId;

    private DepartmentDTO departamentCity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(String codeCity) {
        this.codeCity = codeCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public DepartmentDTO getDepartamentCity() {
        return departamentCity;
    }

    public void setDepartamentCity(DepartmentDTO departamentCity) {
        this.departamentCity = departamentCity;
    }
}
