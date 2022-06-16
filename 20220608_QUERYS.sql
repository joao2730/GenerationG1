use gerationg1;

select * from customers c;

select * from customers c
where c.customerName like '%toy%';

select c.customerNumber, c.customerName from customers c 
where c.customerName like '%toy%';

select c.customerNumber, c.customerName, c.city
from customers c
where c.city = 'Madrid';

-- obteniendo todos los registros de ambas tablas
select * from customers c, orders o
order by c.customerNumber desc;

select *from customers c, orders o 
where c.customerNumber = o.customerNumber 
order by c.customerNumber desc;

-- obtener todas las ordenes por cliente
select c.customerNumber, o.orderNumber, c.customerName  
from customers c, orders o 
where c.customerNumber = o.customerNumber 
and c.customerNumber = 496
order by c.customerNumber desc;

select * from customers c 
where c.customerNumber = 496;

select * from orders o 
where o.customerNumber = 496;

-- productos
select * from products p;

select * from productlines pl;

-- filtrar todos los productos de motorcycles
select p.productName , pl.productLine, pl.textDescription 
from products p , productlines pl
where p.productLine  = pl.productLine
and pl.productLine = 'Motorcycles';

-- Ejercicio
SELECT p.productName, pl.productLine, p.quantityInStock
FROM products p, productlines pl  
WHERE p.productLine = pl.productLine
AND p.productLine = 'Motorcycles' 
ORDER BY p.quantityInStock DESC;

SELECT p.productName, p.quantityInStock, pl.productLine
FROM products p , productlines pl  
WHERE p.productName LIKE '%Ford%'
And p.productLine = pl.productLine
ORDER BY p.productLine ASC;


