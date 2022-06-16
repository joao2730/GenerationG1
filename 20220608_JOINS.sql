-- INNER JOIN
select c.customerNumber, o.orderNumber ,c.customerName 
from customers c, orders o
where c.customerNumber = o.customerNumber 
and c.customerNumber = 496
order by c.customerNumber desc;

select c.customerNumber, o.orderNumber , c.customerName 
from customers c -- tabla A
inner join orders o -- tabla B
on c.customerNumber = o.customerNumber
and c.customerNumber = 496
order by c.customerNumber desc;  

select p.productName, p.productVendor, p.productLine 
from orderdetails od -- tabla A
inner join products p -- tabala B
on od.productCode = p.productCode 

select o.orderDate, o.status, o.comments 
from orderdetails od 
inner join orders o 
on od.orderNumber = o.orderNumber;