-- V1__init_database.sql

CREATE TABLE `players` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`UUID` VARCHAR(36) NOT NULL,
	`UserName` CHAR(16) NOT NULL,
	`LastSeen` DATETIME NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE `blocks` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`X` INT NOT NULL,
	`Y` INT NOT NULL,
	`z` INT NOT NULL,
	`worldid` INT NOT NULL,
	`playerid` INT NOT NULL,
	`placed` DATETIME NOT NULL,
	`blockid` CHAR(128) NOT NULL,
	`DATA` BLOB,
	PRIMARY KEY (id),
	KEY coords(X, Y, z, worldid),
	KEY DATE(placed),
	KEY player(playerid)
);

CREATE TABLE `worlds`(
	`id` INT NOT NULL AUTO_INCREMENT unique,
	`UUID` VARCHAR(36) NOT NULL unique,
	`Name` CHAR(128) NOT NULL,
	PRIMARY KEY(id)
);