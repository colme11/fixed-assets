package com.grupoasd.fixedassets.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
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

    private String serial;

    @Column(name = "peso")
    private Integer weight;

    @Column(name = "alto")
    private Integer high;

    @Column(name = "ancho")
    private Integer width;

    @Column(name = "largo")
    private Integer longAsset;

    @Column(name = "valor_compra")
    private Double valueOfPurchase;

    @Column(name = "fecha_compra")
    private LocalDate dateOfPurchase;

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

    public Integer getIdAsset() {
        return idAsset;
    }

    public void setIdAsset(Integer idAsset) {
        this.idAsset = idAsset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLongAsset() {
        return longAsset;
    }

    public void setLongAsset(Integer longAsset) {
        this.longAsset = longAsset;
    }

    public Double getValueOfPurchase() {
        return valueOfPurchase;
    }

    public void setValueOfPurchase(Double valueOfPurchase) {
        this.valueOfPurchase = valueOfPurchase;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Integer getIdAssetType() {
        return idAssetType;
    }

    public void setIdAssetType(Integer idAssetType) {
        this.idAssetType = idAssetType;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
