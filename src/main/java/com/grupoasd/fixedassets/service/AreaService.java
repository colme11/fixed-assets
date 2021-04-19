package com.grupoasd.fixedassets.service;

import com.grupoasd.fixedassets.model.repository.IAreaRepository;
import com.grupoasd.fixedassets.service.dto.AreaDTO;
import com.grupoasd.fixedassets.service.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AreaService {

    @Autowired
    private IAreaRepository areaRepository;

    @Autowired
    private AreaMapper mapper;

    public Optional<AreaDTO> findByArea(int idArea){
       return areaRepository.findByArea(idArea).map(area -> mapper.toAreaDto(area));
    }


}
