package com.grupoasd.fixedassets.service.dto;

public class AreaDTO {

    private Integer id;

    private String nameArea;

    private Integer cityId;

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
