package com.grupoasd.fixedassets.service.mapper;

import com.grupoasd.fixedassets.model.entity.Area;
import com.grupoasd.fixedassets.service.dto.AreaDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CityMapper.class})
public interface AreaMapper {

    @Mappings({
            @Mapping(source = "idArea", target = "id"),
            @Mapping(source = "name", target = "nameArea"),
            @Mapping(source = "idCity", target = "cityId"),
            @Mapping(source = "city", target = "cityOfArea"),
    })
    AreaDTO toAreaDto(Area area);

    List<AreaDTO> toAreaDtoList(List<Area> areaList);

    @InheritInverseConfiguration
    @Mapping(target = "actives", ignore = true)
    Area toArea(AreaDTO areaDTO);
}
