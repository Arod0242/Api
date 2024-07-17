create table topicos(

    id bigint not null auto_increment,
    titulo varchar(200) not null,
    mensaje varchar(200) not null,
    fechaCreacion TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
    status varchar(100)not null,
    idUsuario varchar(100) not null,
    nombre varchar(100) not null,
    curso varchar(100) not null,

    primary key(id)

)