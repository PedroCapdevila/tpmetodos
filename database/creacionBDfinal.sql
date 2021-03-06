﻿
CREATE TABLE CategoriaLicencia
(
	idCategoriaLicencia serial NOT NULL,
	categoriaLicencia varchar(50) NOT NULL,
	CONSTRAINT PK_CategoriaLicencia PRIMARY KEY (idCategoriaLicencia)
);
CREATE TABLE ClaseLicencia
(
	idClaseLicencia serial NOT NULL,
	claseLicencia varchar(1) NOT NULL,
	CONSTRAINT PK_ClaseLicencia PRIMARY KEY (idClaseLicencia)
);

CREATE TABLE CostoLicencia
(
	vigencia serial NOT NULL,
	claseLicencia smallint NOT NULL,
	precio integer NULL,
	CONSTRAINT PK_CostoLicencia PRIMARY KEY (claseLicencia,vigencia)
);

CREATE TABLE GrupoSanguineo
(
	idGrupoSanguineo serial NOT NULL,
	grupoSanguineo varchar(50) NOT NULL,
	factor varchar(5) NULL,
	CONSTRAINT PK_GrupoSanguineo PRIMARY KEY (idGrupoSanguineo)
);
CREATE TABLE Nacionalidad
(
	idNacionalidad serial NOT NULL,
	nacionalidad varchar(50) NOT NULL,
	CONSTRAINT PK_Nacionalidad PRIMARY KEY (idNacionalidad)
);

CREATE TABLE Sexo
(
	idSexo serial NOT NULL,
	sexo varchar(50) NOT NULL,
	CONSTRAINT PK_Sexo PRIMARY KEY (idSexo)
);

CREATE TABLE TipoDocumento
(
	idTipoDocumento serial NOT NULL,
	tipoDocumento varchar(50) NOT NULL,
	CONSTRAINT PK_TipoDocumento PRIMARY KEY (idTipoDocumento)
);
CREATE TABLE Titular
(
	idTitular serial PRIMARY KEY NOT NULL,
	nombre varchar(50) NOT NULL,
	apellido varchar(50) NOT NULL,
	idTipoDocumento smallint NOT NULL,
	numeroDocumento varchar(50) NOT NULL,
	idSexo smallint NOT NULL,
	idNacionalidad smallint NOT NULL,
	fechaNacimiento date NOT NULL,
	direccion varchar(50) NOT NULL,
	donante smallint NOT NULL,
	idGrupoSanguineo smallint NOT NULL,
	idEmpleadoGestor smallint NOT NULL,
	fechaGestion date NOT NULL,
	CONSTRAINT FK_Titular_GrupoSanguineo FOREIGN KEY (idGrupoSanguineo) REFERENCES GrupoSanguineo (idGrupoSanguineo),
	CONSTRAINT FK_Titular_Nacionalidad FOREIGN KEY (idNacionalidad) REFERENCES Nacionalidad (idNacionalidad),
	CONSTRAINT FK_Titular_Sexo FOREIGN KEY (idSexo) REFERENCES Sexo (idSexo),
	CONSTRAINT FK_Titular_TipoDocumento FOREIGN KEY (idTipoDocumento) REFERENCES TipoDocumento (idTipoDocumento)
);
CREATE TABLE Usuario
(
	idUsuario serial PRIMARY KEY NOT NULL ,
	nombreUsuario varchar(50) NOT NULL,
	contrasena varchar(50) NOT NULL,
	nombre varchar(50) NOT NULL,
	apellido varchar(50) NOT NULL,
	fechaNacimiento date NOT NULL,
	idTipoDocumento smallint NOT NULL,
	numeroDocumento varchar(50) NOT NULL,
	direccion varchar(50) NOT NULL,
	numeroTelefono varchar(50) NULL,
	email varchar(50) NOT NULL,
	permisoSuperUsuario boolean NOT NULL,
	idSexo smallint NOT NULL,
	idEmpleadoGestor smallint NOT NULL,
	fechaGestion date NOT NULL,
	CONSTRAINT FK_Persona_Sexo FOREIGN KEY (idSexo) REFERENCES Sexo (idSexo),
	CONSTRAINT FK_Persona_TipoDocumento FOREIGN KEY (idTipoDocumento) REFERENCES TipoDocumento (idTipoDocumento)
);
CREATE TABLE Licencia
( 	
	numeroLicencia serial PRIMARY KEY NOT NULL,
        idTitularReceptor serial NOT NULL,
	idClaseLicencia smallint NULL,
	fechaEmision date NOT NULL,
	horaEmision time NOT NULL,
	vigencia smallint NULL,
	observacion varchar(500) NULL,
	idCategoriaLicencia smallint NOT NULL,
	idEmpleadoAdmEmisor smallint NOT NULL,
	vigente boolean NOT NULL,
	fechavencimiento date NOT NULL,
	CONSTRAINT FK_Licencia_CategoriaLicencia FOREIGN KEY (idCategoriaLicencia) REFERENCES CategoriaLicencia (idCategoriaLicencia),
	CONSTRAINT FK_Licencia_ClaseLicencia FOREIGN KEY (idClaseLicencia) REFERENCES ClaseLicencia (idClaseLicencia),
	CONSTRAINT FK_Licencia_Titular FOREIGN KEY (idTitularReceptor) REFERENCES Titular (idTitular),
	CONSTRAINT FK_Licencia_Usuario FOREIGN KEY (idEmpleadoAdmEmisor) REFERENCES Usuario (idUsuario)
);




