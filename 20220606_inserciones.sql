use generationg1;


insert into cursos(nombre, descripcion) values ('Alfa', 'aplicados'), ('beta','inteligenetes'), ('gamma','astutos');

insert into registros (codigo_registro, rut) values ('ZP202201','123456-8'), ('AP202201','2345678-9'), ('TL202203', '3456789-7');

insert into direcciones (nombre, numero, ciudad) values ('Prat', '123', 'Arica'), ('Bulnes', '444', 'Punta arenas'), ('Arana','764','Concepcion');

insert into alumnos (nombre, apellido, edad, curso_id, direccion_id, registro_id) values
('Zoe','Palma','3','1','3','1'),
('Ayun','Palma','3','1','3','2'),
('Tom','Loren','2','2','1','3');