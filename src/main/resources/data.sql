
-- Inserção da Saga
INSERT INTO saga (name) VALUES ('Star Wars');

-- Inserção dos detalhes do filme
INSERT INTO detail (date_create, duration, director, producer) VALUES ('1999', '1h 50m','Irvin Kershner','Gary Kurtz, Rick McCallum');
INSERT INTO detail (date_create, duration, director, producer) VALUES ('2002', '1h 50m', 'Irvin Kershner','Gary Kurtz, Rick McCallum');
INSERT INTO detail (date_create, duration, director, producer) VALUES ('2005', '1h 50m', 'Irvin Kershner','Gary Kurtz, Rick McCallum');
INSERT INTO detail (date_create, duration, director, producer) VALUES ('1977', '1h 50m', 'Irvin Kershner','Gary Kurtz, Rick McCallum');
INSERT INTO detail (date_create, duration, director, producer) VALUES ('1980', '1h 50m', 'Irvin Kershner','Gary Kurtz, Rick McCallum');
INSERT INTO detail (date_create, duration, director, producer) VALUES ('1983', '1h 50m', 'Irvin Kershner','Gary Kurtz, Rick McCallum');
INSERT INTO detail (date_create, duration, director, producer) VALUES ('2015', '1h 50m', 'Irvin Kershner','Gary Kurtz, Rick McCallum');

-- Inserção dos filmes
INSERT INTO film (title, description, version, saga_id, detail_id) VALUES ('A Ameaça Fantasma', 'A Ordem Jedi se prepara para a ameaça de um retorno dos Sith.', 1, 1, 1);
INSERT INTO film (title, description, version, saga_id, detail_id) VALUES ('Ataque dos Clones', 'Rainha de Naboo Padmé Amidala (Natalie Portman) enquanto seu mestre Obi-Wan Kenobi', 2, 1, 2);
INSERT INTO film (title, description, version, saga_id, detail_id) VALUES ('A Vingança dos Sith', 'os Jedi resgatam Senador Palpatine, principal líder Sith', 3, 1, 3);
INSERT INTO film (title, description, version, saga_id, detail_id) VALUES ('Uma Nova Esperança', 'O piloto de corridas Luke Skywalker se une a um misterioso Cavaleiro Jedi para salvar a galáxia do poder ditatoria', 4, 1, 4);
INSERT INTO film (title, description, version, saga_id, detail_id) VALUES ('O Império Contra-Ataca', 'Aliança Rebelde é derrotada por Darth Vader no planeta glacial Hoth e seus membros presos pelo Império Galáctico.', 5, 1, 5);
INSERT INTO film (title, description, version, saga_id, detail_id) VALUES ('O Retorno do Jedi', 'Rebeldes chegam ao planeta Endor para destruir uma segunda Estrela da Morte construída pelo Império Galáctico', 6, 1, 6);
INSERT INTO film (title, description, version, saga_id, detail_id) VALUES ('O Despertar da Força', 'A órfã Rey (Daisy Ridley) se une ao stormtrooper desertor Finn para encontrar o lendário piloto Han Solo e encerrar a ameaça de caos na galáxia', 7, 1, 7);

