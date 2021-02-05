CREATE SCHEMA `jogo`;
USE `jogo`;

CREATE SEQUENCE hibernate_sequence START WITH 1;

CREATE TABLE cenario (
   id bigint NOT NULL PRIMARY KEY,
   pais varchar(255) NOT NULL
);

CREATE TABLE personagem (
	id bigint NOT NULL PRIMARY KEY,
    nacionalidade varchar(255) NOT NULL,
    tipo varchar(255) NOT NULL,
    primeiro_nome varchar(255) NOT NULL,
    segundo_nome varchar(255) NOT NULL,
    frase_efeito varchar(255) NOT NULL,
    id_cenario bigint NOT NULL,
    life float(53) NOT NULL,
    UNIQUE(primeiro_nome, segundo_nome),
    FOREIGN KEY (id_cenario) REFERENCES cenario(id)
);

CREATE TABLE luta (
  id bigint,
  tempo int,
  id_lutador1 bigint NOT NULL,
  id_lutador2 bigint NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_lutador1) REFERENCES personagem(id),
  FOREIGN KEY (id_lutador2) REFERENCES personagem(id)
);



