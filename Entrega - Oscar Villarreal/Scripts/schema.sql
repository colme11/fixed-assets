CREATE SCHEMA activosfijos;

-- -----------------------------------------------------
-- Table "DEPARTAMENTO"
-- -----------------------------------------------------
CREATE TABLE  activosfijos.departamentos (
  id_departamento int(11) NOT NULL AUTO_INCREMENT,
  codigo_dane VARCHAR(50) NOT NULL,
  nombre VARCHAR(150) NOT NULL,
  PRIMARY KEY (id_departamento),
  UNIQUE KEY nombre_UNIQUE (nombre)
  )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- -----------------------------------------------------
-- Table "CIUDADES"
-- -----------------------------------------------------
CREATE TABLE  activosfijos.ciudades (
  id_ciudad int(11) NOT NULL AUTO_INCREMENT,
  codigo_dane VARCHAR(50) NOT NULL,
  nombre VARCHAR(150) NOT NULL,
  id_departamento INT NOT NULL,
  PRIMARY KEY (id_ciudad),
  CONSTRAINT fk_DEPARTAMENTO
    FOREIGN KEY (id_departamento)
    REFERENCES activosfijos.departamentos (id_departamento)
  )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
  
-- -----------------------------------------------------
-- Table "AREAS"
-- -----------------------------------------------------
CREATE TABLE  activosfijos.areas (
  id_area int(11) NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(150) NOT NULL,
  id_ciudad INT NOT NULL,
  PRIMARY KEY (id_area),
  CONSTRAINT fk_CIUDAD
    FOREIGN KEY (id_ciudad)
    REFERENCES ciudades (id_ciudad)
  )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
  
  
-- -----------------------------------------------------
-- Table "EMPLEADOS"
-- -----------------------------------------------------
CREATE TABLE  activosfijos.empleados (
  cedula int(11) NOT NULL,
  primer_nombre VARCHAR(50) NOT NULL,
  segundo_nombre VARCHAR(50),
  primer_apellido VARCHAR(50) NOT NULL,
  segundo_apellido VARCHAR(50) NOT NULL,
  numero_telefono VARCHAR(11),
  numero_celular VARCHAR(11),
  correo_electronico VARCHAR(80),
  PRIMARY KEY (cedula)
  );

-- -----------------------------------------------------
-- Table "TIPO_ACTIVO"
-- -----------------------------------------------------
CREATE TABLE  activosfijos.tipo_activos (
  id_tipo_activo int(11) NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  descripcion VARCHAR(300) NOT NULL,
  PRIMARY KEY (id_tipo_activo),
  UNIQUE KEY nombre_UNIQUE (nombre)
  )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- -----------------------------------------------------
-- Table "ACTIVOS"
-- -----------------------------------------------------
CREATE TABLE  activosfijos.activos (
  numero_inventario int(11) NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  descripcion VARCHAR(45) NOT NULL,
  id_tipo_activo INT NOT NULL,
  id_area INT,
  id_empleado INT,
  serial VARCHAR(30),
  peso INT,
  alto INT,
  ancho INT,
  largo INT,
  valor_compra DECIMAL(16,2) NULL,
  fecha_compra TIMESTAMP NULL,
  PRIMARY KEY (numero_inventario),
  CONSTRAINT fk_TIPO_ACTIVO
    FOREIGN KEY (id_tipo_activo)
    REFERENCES tipo_activos (id_tipo_activo),
  CONSTRAINT fk_AREA
    FOREIGN KEY (id_area)
    REFERENCES areas (id_area),
  CONSTRAINT fk_EMPLEADO
    FOREIGN KEY (id_empleado)
    REFERENCES empleados (cedula)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;