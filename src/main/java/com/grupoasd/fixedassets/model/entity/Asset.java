package com.grupoasd.fixedassets.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "activos")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_inventario")
    private Integer idAsset;

    @Column(name = "nombre")
    private String name;

    @Column(name = "descripcion")
    private String descripcion;

    private int serial;

    @Column(name = "peso")
    private int weight;

    @Column(name = "alto")
    private int high;

    @Column(name = "ancho")
    private int width;

    @Column(name = "largo")
    private int longAsset;

    @Column(name = "valor_compra")
    private double valueOfPurchase;

    @Column(name = "fecha_compra")
    private LocalDateTime dateOfPurchase;

    @Column(name = "id_tipo_activo")
    private Integer idAssetType;

    @Column(name = "id_area")
    private Integer idArea;

    @Column(name = "id_empleado")
    private Integer idEmployee;

    @ManyToOne
    @JoinColumn(name = "id_tipo_activo", insertable = false, updatable = false)
    private AssetType assetType;

    @ManyToOne
    @JoinColumn(name = "id_area", insertable = false, updatable = false)
    private Area area;

    @ManyToOne
    @JoinColumn(name = "id_empleado", insertable = false, updatable = false)
    private Employee employee;
}
