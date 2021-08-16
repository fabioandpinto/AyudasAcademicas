CREATE TABLE ALUMNO (
	idAlumno int NOT NULL auto_increment, 
    nombre varchar(30) not null, 
    apellido varchar(30) not null, 
    telefono varchar(30) not null, 
    universidad varchar(30),
    programa varchar(30),
    primary key(idAlumno)
)

CREATE TABLE tutor (
	idTutor int NOT NULL auto_increment, 
    nombre varchar(30) not null, 
    apellido varchar(30) not null, 
    telefono varchar(30) not null, 
    profesion varchar(30) not null,
    primary key(idTutor)
)

CREATE TABLE trabajos (
	idTrabajo varchar(5) NOT NULL, 
    idAlumno varchar(30) not null, 
    idTutor varchar(30) not null, 
    estado varchar(1) not null,
    primary key(idTrabajo)
)

create table detalleTrabajo (
	idDetalleTrabajo int not null auto_increment,
	idTrabajo varchar(5) not null, 
    precio double not null,
    asignatura varchar(20) not null, 
	FechaEntrega varchar(30) not null,
    primary key(idDetalleTrabajo)
)
