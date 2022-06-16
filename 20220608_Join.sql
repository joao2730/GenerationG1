select * from alumnos;
select * from grupos g;

-- INNER JOIN
select *
from tablaA a
inner join tableB b
on a.key = b.key;

select *
from alumnos a 
inner join grupos g 
on a.grupo_id = g.id;

select a.id, a.nombre as 'alumno', g.nombre as 'nombreGrupo'
from alumnos a 
inner join grupos g 
on a.grupo_id = g.id 
where g.id = 4

-- left join: se da prioridad a la tabla de la izquierda

select *
from alumnos a 
left join grupos g 
on a.grupo_id = g.id;

select a.id, a.nombre as 'alumno', g.nombre as 'nombreGrupo'
from alumnos a 
left join grupos g 
on a.grupo_id = g.id; 

-- Right join: se da prioridad a la tabla de la derecha
-- si no existen intersecciones arroja nulo

insert into grupos values(7, 'Grupo7'); 

select *
from alumnos a 
right join grupos g 
on a.grupo_id = g.id;

select a.id, a.nombre as 'alumno', g.nombre as 'nombreGrupo'
from alumnos a 
right join grupos g 
on a.grupo_id = g.id;

-- FULL JOIN: trae todo el universo de datos
-- no funciona en esta version de mysql

select *
from alumnos a 
full outer join grupos g 
on a.grupo_id = g.id;

select a.id, a.nombre as 'alumno', g.nombre as 'nombreGrupo'
from alumnos a 
full outer join grupos g 
on a.grupo_id = g.id;

-- Union: une los datos de la izquierda con los datos de la derecha
-- Alternativa para esta version de mysql
select *
from alumnos a 
right join grupos g 
on a.grupo_id = g.id
union
select *
from alumnos a 
left join grupos g 
on a.grupo_id = g.id;