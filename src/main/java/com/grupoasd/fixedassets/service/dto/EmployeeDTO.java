package com.grupoasd.fixedassets.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDTO {

    @JsonProperty("id_empleado")
    private Integer id;

    @JsonIgnore
    private String firstNameEmployee;

    @JsonIgnore
    private String secondNameEmployee;

    @JsonIgnore
    private String firstLastnameEmployee;

    @JsonIgnore
    private String secondLastnameEmployee;

    @JsonProperty("nombre")
    private String nameEmployee;

    @JsonProperty("numero_telefonico")
    private String phoneNumberEmployee;

    @JsonProperty("numero_celular")
    private String cellNumberEmployee;

    @JsonProperty("correo_electronico")
    private String emailEmployee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstNameEmployee() {
        return firstNameEmployee;
    }

    public void setFirstNameEmployee(String firstNameEmployee) {
        this.firstNameEmployee = firstNameEmployee;
    }

    public String getSecondNameEmployee() {
        return secondNameEmployee;
    }

    public void setSecondNameEmployee(String secondNameEmployee) {
        this.secondNameEmployee = secondNameEmployee;
    }

    public String getFirstLastnameEmployee() {
        return firstLastnameEmployee;
    }

    public void setFirstLastnameEmployee(String firstLastnameEmployee) {
        this.firstLastnameEmployee = firstLastnameEmployee;
    }

    public String getSecondLastnameEmployee() {
        return secondLastnameEmployee;
    }

    public void setSecondLastnameEmployee(String secondLastnameEmployee) {
        this.secondLastnameEmployee = secondLastnameEmployee;
    }

    public String getNameEmployee() {
        return firstNameEmployee+" "+secondNameEmployee+" "+firstLastnameEmployee+" "+secondLastnameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getPhoneNumberEmployee() {
        return phoneNumberEmployee;
    }

    public void setPhoneNumberEmployee(String phoneNumberEmployee) {
        this.phoneNumberEmployee = phoneNumberEmployee;
    }

    public String getCellNumberEmployee() {
        return cellNumberEmployee;
    }

    public void setCellNumberEmployee(String cellNumberEmployee) {
        this.cellNumberEmployee = cellNumberEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }
}
