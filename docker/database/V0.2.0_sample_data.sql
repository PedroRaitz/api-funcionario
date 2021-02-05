USE `employeedb`;

INSERT INTO employee (id, first_name,last_name) VALUES (nextval(hibernate_sequence), 'John', 'Lennon');
INSERT INTO employee (id, first_name,last_name) VALUES (nextval(hibernate_sequence), 'Janis', 'Joplin');