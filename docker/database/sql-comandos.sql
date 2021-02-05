CREATE SCHEMA `employeedb`;
USE `employeedb`;

CREATE SEQUENCE hibernate_sequence START WITH 1;

CREATE TABLE employee (
    id bigint NOT NULL PRIMARY KEY,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    UNIQUE(first_name, last_name)
);

show schemas;

use employeedb;

show tables;

INSERT INTO employee (id, first_name,last_name) VALUES (nextval(hibernate_sequence), 'John', 'Lennon');
INSERT INTO employee (id, first_name,last_name) VALUES (nextval(hibernate_sequence), 'Janis', 'Joplin');

select * from employee;