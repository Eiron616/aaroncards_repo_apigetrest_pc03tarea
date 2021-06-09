drop database if exists `aaroncards`;
create database if not exists `aaroncards`;
use `aaroncards`;

drop table if exists paquetecarta;
create table paquetecarta(
codpaquecart int not null auto_increment,
nompaquecart varchar(177) default null,
descpaquecart varchar(127) default null,
fchregpaquecart datetime default null,
preciopaquecart double default null,
primary key(codpaquecart)
);

insert into paquetecarta values (1,'Paquete Cartas Neo Revolution YU-GI-OH','Nueva serie de paquete de cartas de la serie animada YU-GI-OH.',
									'2021-01-21 21:15:07',99.5);
insert into paquetecarta values (2,'Paquete Cartas Espada&Escudo Pokémon','Edición especial del nuevo paquete de cartas de la franquicia Pokémon.',
									'2021-03-14 17:20:14',250.0);
insert into paquetecarta values (3,'Paquete Cartas Magic: Hora de la devastasión','Paquete de cartas del juego Magic, desata la guerra.',
									'2019-07-03 09:11:33',49.9);
insert into paquetecarta values (4,'Harry Potter - Callejón Diagon Caja de Cartas','La famosa serie cinematográfica se aventura en el mundo del TCG.',
									'2021-04-09 13:22:00',125.1);
insert into paquetecarta values (5,'Digimon Colección Clásica - Booster Box','Edición limitada de cartas remasterizadas del TCG de Digimon.',
									'2020-07-17 17:57:37',177.7);
insert into paquetecarta values (6,'World of Warcraft : Reino de fuego','Colección de cartas del videjuego WoW, limitada y remasterizada.',
									'2021-06-06 19:14:47',80.0);
insert into paquetecarta values (7,'WWE: Then Now Forever','La famosa compañia de lucha libre incursiona en el mundo del Trading Card Game (TCG).',
									'2018-08-11 05:22:28',322.2);

select * from paquetecarta;