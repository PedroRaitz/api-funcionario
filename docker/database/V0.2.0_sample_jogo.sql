USE `jogo`;

insert INTO cenario (id, pais)VALUES (nextval(hibernate_sequence), 'colombia');
insert INTO cenario (id, pais)VALUES (nextval(hibernate_sequence), 'afeganistao');
insert INTO cenario (id, pais)VALUES (nextval(hibernate_sequence), 'brasil');

insert INTO personagem (id, primeiro_nome, segundo_nome, frase_efeito, nacionalidade, tipo, life, id_cenario)VALUES (nextval(hibernate_sequence), 'pablo', 'escobar', 'onde esta mi droga, filo de puta ', 'colombiano', 'traficante', 100.0, 3);
insert INTO personagem (id, primeiro_nome, segundo_nome, frase_efeito, nacionalidade, tipo, life, id_cenario)VALUES (nextval(hibernate_sequence), 'bin', 'laden', 'habalalala', 'afegao', 'terrorista', 100.0, 1);
insert INTO personagem (id, primeiro_nome, segundo_nome, frase_efeito, nacionalidade, tipo, life, id_cenario)VALUES (nextval(hibernate_sequence), 'jair', 'bolsonaro', 'ta errado isso ai talok', 'brasileiro', 'miliciano presidente', 100.0, 2);

insert INTO luta (id, id_lutador1, id_lutador2) VALUES (nextval(hibernate_sequence), 3, 4); 
