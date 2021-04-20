package com.grupoasd.fixedassets.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AreaDTO {

    @JsonIgnore
    private Integer id;

    @JsonProperty("nombre")
    private String nameArea;

    @JsonIgnore
    private Integer cityId;

    @JsonProperty("ciudad")
    private CityDTO cityOfArea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameArea() {
        return nameArea;
    }

    public void setNameArea(String nameArea) {
        this.nameArea = nameArea;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public CityDTO getCityOfArea() {
        return cityOfArea;
    }

    public void setCityOfArea(CityDTO cityOfArea) {
        this.cityOfArea = cityOfArea;
    }
}
