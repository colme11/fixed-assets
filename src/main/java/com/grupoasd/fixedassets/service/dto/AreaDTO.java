package com.grupoasd.fixedassets.service.dto;

import lombok.Data;

@Data
public class AreaDTO {

    private Integer id;

    private String nameArea;

    private Integer cityId;

    private CityDTO cityOfArea;
}
