# Write your MySQL query statement below


SELECT  firstname,lastname,city,state from person p left join Address a on p.personId = a.personId;