package com.grupoasd.fixedassets.service;

import com.grupoasd.fixedassets.controller.AssetController;
import com.grupoasd.fixedassets.model.repository.IAreaRepository;
import com.grupoasd.fixedassets.service.dto.AreaDTO;
import com.grupoasd.fixedassets.service.mapper.AreaMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AreaService {

    private static final Logger logger = LoggerFactory.getLogger(AreaService.class);

    @Autowired
    private IAreaRepository areaRepository;

    @Autowired
    private AreaMapper mapper;

    /**
     * Query an area for id
     *
     * @param idArea
     * @return
     */
    public Optional<AreaDTO> findByArea(int idArea){
        logger.info("AreaService.findByArea() - Query area by its id");
        return areaRepository.findByArea(idArea).map(area -> mapper.toAreaDto(area));
    }


}
