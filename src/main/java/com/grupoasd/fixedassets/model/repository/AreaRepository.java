package com.grupoasd.fixedassets.model.repository;

import com.grupoasd.fixedassets.model.crud.AreaCrudRepository;
import com.grupoasd.fixedassets.model.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * This class interacts with the Area table of our database
 */
@Repository
public class AreaRepository implements IAreaRepository{

    @Autowired
    private AreaCrudRepository areaCrudRepository;

    @Override
    public Optional<Area> findByArea(int idArea) {
        return areaCrudRepository.findById(idArea);
    }
}
