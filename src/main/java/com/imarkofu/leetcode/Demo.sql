-- 175-组合两个表
select FirstName,LastName,City,State from Person p left join Address a on p.PersonId=a.PersonId;

-- 176-第二高的薪水
select max(Salary) SecondHighestSalary from Employee where Salary<(select max(Salary) from Employee);

