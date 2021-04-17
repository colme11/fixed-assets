package com.grupoasd.fixedassets.model.repository;

import com.grupoasd.fixedassets.model.entity.Area;

import java.util.Optional;

public interface IAreaRepository {

    Optional<Area> findByArea(int idArea);
}
